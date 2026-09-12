```C
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct
{
    char nome[50];
    int numero;
} aviao;

typedef struct NOH
{
    aviao dados;
    struct NOH *proximo;
} *tipoFila;

tipoFila criarItem(aviao novoAviao)
{
    tipoFila novoNoh = malloc(sizeof(struct NOH));

    if (novoNoh == NULL)
    {
        return NULL;
    }
    else
    {
        novoNoh->dados = novoAviao;
        novoNoh->proximo = NULL;

        return novoNoh;
    }
}

tipoFila inserir(tipoFila fila, aviao a)
{
    tipoFila novoNoh = criarItem(a);

    if (fila == NULL)
    {
        return novoNoh;
    }
    else
    {
        tipoFila aux = fila;

        while (aux->proximo != NULL)
        {
            aux = aux->proximo;
        }
        aux->proximo = novoNoh;
        return fila;
    }
}

tipoFila remover(tipoFila fila)
{
    if (fila == NULL)
    {
        return NULL;
    }
    else
    {
        tipoFila aux = fila;
        fila = fila->proximo;

        free(aux);
        aux = NULL;
    }
    return fila;
}

void listarTodos(tipoFila fila)
{
    if (fila == NULL)
    {
        printf("Fila Vazia!\n");
    }
    else
    {
        tipoFila aux = fila;
        while (aux != NULL)
        {
            printf("[%s-%d]\n", aux->dados.nome, aux->dados.numero);
            aux = aux->proximo;
        }
    }
}

int contador(tipoFila fila)
{
    int qtd = 0;
    
        tipoFila aux = fila;
        while (aux != NULL)
        {
            qtd++;
            aux = aux->proximo;
        }
    return qtd;
}

void listarPrimeiro(tipoFila fila)
{
    if (fila == NULL)
    {
        printf("Fila vazia\n");
    }
    else
    {

        printf("Primeiro: %s-%d\n", fila->dados.nome, fila->dados.numero);
    }
}

void main()
{
    tipoFila fila = NULL;
    aviao a;
    int op = -1;

    while (op != 0)
    {
        printf("1-informe o aviao que deseja inserir:\n");
        printf("2-Quantos avioes tem aguardando na fila?\n");
        printf("3-Atorizar decolagem(Remover)\n");
        printf("4-Listar todos os avioes\n");
        printf("5-Listar primeiro aviao\n");
        scanf("%d", &op);

        switch (op)
        {
        case 1:
            printf("informe o nome do aviao:\n");
            scanf("%s", a.nome);
            printf("informe o numero do aviao:\n");
            scanf("%d", &a.numero);
            fila = inserir(fila, a);
            break;

        case 2:
            printf("%d\n", contador(fila));
            break;

        case 3:
            fila = remover(fila);
            break;
        case 4:
            listarTodos(fila);
            break;
        case 5:
            listarPrimeiro(fila);
            break;

        default:
            break;
        }
    }
}
```
