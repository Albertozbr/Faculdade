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
    if (tree != NULL)
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
    if (tree = NULL)
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
        if (tree->sonRight == NULL & tree->sonLeft == NULL)
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
        else if (tree->sonRight = NULL)
        {
            tipoarvore temp = tree->sonLeft;
            free(tree);
            return tree;
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
// caso base source = NULL, recursividade roda até o filho da esquerda e o filho da direita cair no caso base. O "1+" é da raiz já
int total(tipoarvore source)
{
    if (source == NULL)
    {
        return 0;
    }
    return 1 + total(source->sonLeft) + total(source->sonRight);
}
// percorrer até chegar no final, chegou no final "folha", contar só ele
int totalLeaf(tipoarvore source)
{
    if (source == NULL)
    {
        return 0;
    }
    if (source->sonLeft == NULL && source->sonRight == NULL)
    {
        return 1 + totalLeaf(source->sonRight) + totalLeaf(source->sonLeft);
    }
    else
    {
        return totalLeaf(source->sonRight) + totalLeaf(source->sonLeft);
    }
}

int height(tipoarvore source)
{
    if (source == NULL)
    {
        return -1; // caso raiz só tenha um numero, irá cair no esquerda direta é maior, (-1) + 1 = 0, altura 0
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

tipoarvore max(tipoarvore source)
{
    if (source == NULL)
    {
        return -1;
    }
    while (source->sonRight != NULL)
    {
        source = source->sonRight;
    }
    return source->source;
}
int min(tipoarvore source)
{
    if (source == NULL)
    {
        return NULL;
    }
    while (source->sonLeft != NULL)
    {
        source = source->sonLeft;
    }
    return source->source;
}

int sumValues(tipoarvore source)
{
    if (source == NULL)
    {
        return 0;
    }
    return source->source + sumValues(source->sonLeft) + sumValues(source->sonRight);
}

void main()
{
    tipoarvore source = NULL;
    int value;
    source = insertItem(10, source);
    source = insertItem(8, source);
    source = insertItem(12, source);
    source = insertItem(14, source);
    source = insertItem(9, source);
    source = insertItem(7, source);

    printf("Pre-Order: ");
    preOrder(source); // Vai imprimir: 10 8 12
    printf("\n");

    printf("In Order: ");
    inOrder(source); // Vai imprimir: 8 10 12 (Ordem crescente!)
    printf("\n");

    printf("Post-Order: ");
    postOrder(source); // Vai imprimir: 8 12 10
    printf("\n");

    int result = total(source);
    printf("Total number of NOH: %d\n", result);

    int leaf = totalLeaf(source);
    printf("Total number of sheets: %d\n", leaf);

    int result_height = height(source);
    printf("Value number Of height(by edges): %d\n", result_height);

    int findMaxValue = max(source);
    printf("The bigger value is: %d\n", findMaxValue);

    int findMinValue = min(source);
    printf("The smaller value is: %d\n", findMinValue);

    int sumVAlues = sumValues(source);
    printf("the sum of all values in the tree: %d\n", sumVAlues);

    int average = sumVAlues/result;
    printf("Average: %d\n", average);
}
