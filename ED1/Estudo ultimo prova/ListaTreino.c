#include <stdio.h>
#include <stdlib.h>

// Estrutura do nó (simplesmente encadeada, de acordo com a imagem do exercício 11)
typedef struct NOH
{
    int dados;
    struct NOH *next;
} *tipolista;

// Função auxiliar para criar um novo nó
tipolista createItem(int valor)
{
    tipolista novo = malloc(sizeof(struct NOH));
    if (novo == NULL)
        return NULL;

    novo->dados = valor;
    novo->next = NULL;
    return novo;
}

// Função auxiliar para inserir no final da lista original
tipolista insertEnd(tipolista list, int valor)
{
    tipolista novo = createItem(valor);
    if (list == NULL)
        return novo;

    tipolista aux = list;
    while (aux->next != NULL)
    {
        aux = aux->next;
    }
    aux->next = novo;
    return list;
}

// ---------------------------------------------------------
// FUNÇÃO DO EXERCÍCIO 11: Separar Pares e Ímpares
// ---------------------------------------------------------
// Usamos ponteiros duplos (**listaPar, **listaImpar) para poder
// alterar o "início" dessas listas diretamente lá na main.
void parImpar(tipolista list, tipolista *listaPar, tipolista *listaImpar)
{
    tipolista aux = list;
    tipolista ultimoPar = NULL;
    tipolista ultimoImpar = NULL;

    // Garante que as listas de destino comecem vazias
    *listaPar = NULL;
    *listaImpar = NULL;

    while (aux != NULL)
    {
        // 1. Salva o resto do trem original
        tipolista proximo = aux->next;

        // 2. Desengata o vagão atual
        aux->next = NULL;

        // 3. Distribui para Par ou Ímpar
        if (aux->dados % 2 == 0)
        { // É PAR
            if (*listaPar == NULL)
            {
                *listaPar = aux; // É o primeiro vagão par
                ultimoPar = aux;
            }
            else
            {
                ultimoPar->next = aux; // Engata atrás do último par
                ultimoPar = aux;
            }
        }
        else
        { // É ÍMPAR
            if (*listaImpar == NULL)
            {
                *listaImpar = aux; // É o primeiro vagão ímpar
                ultimoImpar = aux;
            }
            else
            {
                ultimoImpar->next = aux; // Engata atrás do último ímpar
                ultimoImpar = aux;
            }
        }

        // 4. Pula para o próximo vagão da lista original (que tínhamos salvo)
        aux = proximo;
    }
}

// Função para exibir a lista na tela
void display(tipolista list, const char *nomeLista)
{
    printf("%s: ", nomeLista);
    if (list == NULL)
    {
        printf("Vazia\n");
        return;
    }

    tipolista aux = list;
    printf("Inicio -> ");
    while (aux != NULL)
    {
        printf("[%d] -> ", aux->dados);
        aux = aux->next;
    }
    printf("NULL\n");
}

int main()
{
    tipolista original = NULL;
    tipolista pares = NULL;
    tipolista impares = NULL;

    int op = -1, valor;

    while (op != 0)
    {
        printf("\n==================================\n");
        printf("1 - Inserir numero na lista original\n");
        printf("2 - Exibir todas as listas\n");
        printf("3 - Executar parImpar (Exercicio 11)\n");
        printf("0 - Sair\n");
        printf("Escolha: ");
        scanf("%d", &op);

        switch (op)
        {
        case 1:
            printf("Digite um numero inteiro: ");
            scanf("%d", &valor);
            original = insertEnd(original, valor);
            break;

        case 2:
            printf("\n--- ESTADO DAS LISTAS ---\n");
            display(original, "Lista Original");
            display(pares, "Lista de Pares");
            display(impares, "Lista de Impares");
            break;

        case 3:
            // Passamos o endereço (&) das listas par e ímpar para a função preenchê-las
            parImpar(original, &pares, &impares);

            // Como os nós foram fisicamente movidos, a lista original ficou vazia
            original = NULL;
            printf("\n>> Listas separadas com sucesso! <<\n");
            break;

        case 0:
            printf("Saindo...\n");
            break;

        default:
            printf("Opcao Invalida!\n");
        }
    }

    return 0;
}