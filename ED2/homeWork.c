#include <stdio.h>
#include <stdlib.h>

typedef struct NOH
{
    int source;
    struct NOH *sonRight;
    struct NOH *sonLeft;
} *tipoarvore;

tipoarvore createItem(int value)
{
    tipoarvore newItem = malloc(sizeof(struct NOH));
    if (newItem == NULL)
    {
        return NULL;
    }
    newItem->source = value;
    newItem->sonRight = NULL;
    newItem->sonLeft = NULL;

    return newItem;
}

tipoarvore insertItem(int value, tipoarvore tree)
{
    if (tree == NULL)
    {
        return createItem(value);
    }
    if (value > tree->source)
    {
        tree->sonRight = insertItem(value, tree->sonRight);
    }
    else if (value < tree->source)
    {
        tree->sonLeft = insertItem(value, tree->sonLeft);
    }
    return tree;
}

void preOrder(tipoarvore tree)
{
    if (tree != NULL)
    {
        printf("%d ", tree->source);
        preOrder(tree->sonLeft);
        preOrder(tree->sonRight);
    }
}

void inOrder(tipoarvore tree)
{
    if (tree != NULL)
    {
        inOrder(tree->sonLeft);
        printf("%d ", tree->source);
        inOrder(tree->sonRight);
    }
}

void postOrder(tipoarvore tree)
{
    if (tree != NULL)
    {
        postOrder(tree->sonLeft);
        postOrder(tree->sonRight);
        printf("%d ", tree->source);
    }
}


tipoarvore findMin(tipoarvore tree)
{
    if (tree == NULL)
    {
        return NULL;
    }
    while (tree->sonLeft != NULL)
    {
        tree = tree->sonLeft;
    }
    return tree;
}


tipoarvore removeItem(int value, tipoarvore tree)
{
    if (tree == NULL)
    {
        return NULL;
    }
    if (value < tree->source)
    {
        tree->sonLeft = removeItem(value, tree->sonLeft);
    }
    else if (value > tree->source)
    {
        tree->sonRight = removeItem(value, tree->sonRight);
    }
    else
    {
        // case 1: it's a leaf
        if (tree->sonRight == NULL && tree->sonLeft == NULL)
        {
            free(tree);
            return NULL;
        }
        // case 2: has only one son
        else if (tree->sonLeft == NULL)
        {
            tipoarvore temp = tree->sonRight;
            free(tree);
            return temp;
        }
        else if (tree->sonRight == NULL)
        { // CORRIGIDO: ==
            tipoarvore temp = tree->sonLeft;
            free(tree);
            return temp; 
        }
        // case 3: has two son
        else
        {
            tipoarvore temp = findMin(tree->sonRight);
            tree->source = temp->source;
            tree->sonRight = removeItem(temp->source, tree->sonRight);
        }
    }
    return tree;
}

int total(tipoarvore source)
{
    if (source == NULL)
    {
        return 0;
    }
    return 1 + total(source->sonLeft) + total(source->sonRight);
}

int totalLeaf(tipoarvore source)
{
    if (source == NULL)
    {
        return 0;
    }
    // CORRIGIDO: Se é folha, retorna apenas 1 e para.
    if (source->sonLeft == NULL && source->sonRight == NULL)
    {
        return 1;
    }
    return totalLeaf(source->sonRight) + totalLeaf(source->sonLeft);
}

int height(tipoarvore source)
{
    if (source == NULL)
    {
        return -1;
    }
    else
    {
        int left = height(source->sonLeft);
        int right = height(source->sonRight);

        if (left > right)
        {
            return left + 1;
        }
        else
        {
            return right + 1;
        }
    }
}


int findMaxValue(tipoarvore source)
{
    if (source == NULL)
    {
        return -1; // Retorno de erro caso a árvore esteja vazia
    }
    while (source->sonRight != NULL)
    {
        source = source->sonRight;
    }
    return source->source;
}


int findMinValue(tipoarvore source)
{
    if (source == NULL)
    {
        return -1;
    }
    while (source->sonLeft != NULL)
    {
        source = source->sonLeft;
    }
    return source->source;
}

// Soma dos valores armazenados
int sumValues(tipoarvore source)
{
    if (source == NULL)
    {
        return 0;
    }
    return source->source + sumValues(source->sonLeft) + sumValues(source->sonRight);
}

// Média dos valores armazenados
float averageValues(tipoarvore source)
{
    int totalNodes = total(source);
    if (totalNodes == 0)
    {
        return 0.0;
    }
    // Faz o cast (float) para garantir que a divisão tenha casas decimais
    return (float)sumValues(source) / totalNodes;
}

void bfs(tipoarvore source)
{
    if (source == NULL)
    {
        return;
    }

    
    tipoarvore queue[100];
    int front = 0; 
    int rear = 0;  

    // Coloca a raiz na fila
    queue[rear] = source;
    rear++;

    
    while (front < rear)
    {
        tipoarvore current = queue[front];
        front++; 

        printf("%d ", current->source);

        
        if (current->sonLeft != NULL)
        {
            queue[rear] = current->sonLeft;
            rear++;
        }
        
        if (current->sonRight != NULL)
        {
            queue[rear] = current->sonRight;
            rear++;
        }
    }
}

void main()
{
    tipoarvore source = NULL;

    source = insertItem(10, source);
    source = insertItem(8, source);
    source = insertItem(12, source);
    source = insertItem(14, source);
    source = insertItem(9, source);
    source = insertItem(7, source);

    printf("--- TRAVESSIAS ---\n");
    printf("Pre-Order: ");
    preOrder(source);
    printf("\n");
    printf("In Order: ");
    inOrder(source);
    printf("\n");
    printf("Post-Order: ");
    postOrder(source);
    printf("\n");

    printf("\n--- QUESTAO 4 ---\n");
    printf("BFS (Largura): ");
    bfs(source);
    printf("\n");

    printf("\n--- QUESTAO 3 ---\n");
    printf("Total number of NOH: %d\n", total(source));
    printf("Total number of sheets (folhas): %d\n", totalLeaf(source));
    printf("Height (by edges): %d\n", height(source));
    printf("Max value (Maior): %d\n", findMaxValue(source));
    printf("Min value (Menor): %d\n", findMinValue(source));
    printf("Sum of values (Soma): %d\n", sumValues(source));
    printf("Average (Media): %.2f\n", averageValues(source));
}