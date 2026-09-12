```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 3

typedef struct{
    int idade;
    char nome[50];
}Pessoa;
typedef struct{
    int inicio, fim;
    Pessoa noh[TAM];
}fila;


void inicializar(fila *fila){
    fila->inicio = 0;
    fila->fim = -1;
}

int cheia(fila *fila){
    if(fila->fim == TAM - 1){
        return 1;
    }else{
        return 0;
    }
}

int vazia(fila *fila){
    if(fila->inicio > fila->fim){
        return 1;
    }else{
        return 0;
    }
}

int inserir(fila *fila, Pessoa p){
    if(cheia(fila)==1){
        printf("Fila cheia!");
        return -1;
    }else{
        fila->fim++;
        fila->noh[fila->fim] = p;
        return 1;
    }
}

Pessoa remover(fila *fila){
    Pessoa pRemoved;

    if(vazia(fila)==1){
        printf("Fila vazia, impossivel remover!");
        pRemoved.idade = -1;
        strcpy(pRemoved.nome, "Erro");
        return pRemoved;
    }else{
        pRemoved = fila->noh[fila->inicio];
        fila->inicio++;
    
        return pRemoved; 
    }
}
void exibir(fila *fila)
{
    // 1. É sempre bom avisar se não tiver ninguém para mostrar
    if (vazia(fila) == 1)
    {
        printf("\n--- Fila Vazia! ---\n");
        return;
    }

    int i = fila->inicio;
    printf("\n--- Fila Atual ---\n");

    while (i <= fila->fim)
    {
        // 2. Agora nós acessamos o .nome e a .idade de cada pessoa no vetor
        printf("Posicao [%d] -> Nome: %s | Idade: %d\n", i, fila->noh[i].nome, fila->noh[i].idade);
        i++;
    }
    printf("-------------------\n");
}

void RemoverPessoa(fila *f, char informado[]){
    fila aux;
    inicializar(&aux);
    Pessoa pAtual;

    while(vazia(f)==0){
        pAtual = remover(f);

        if(strcmp(pAtual.nome, informado)!=0){
            inserir(&aux, pAtual);
        }
    }
    inicializar(f);
    while(vazia(&aux)==0){
        pAtual = remover(&aux);
        inserir(f, pAtual);
    }
}

int main()
{
    fila minhaFila;     // Evita usar o mesmo nome da struct
    Pessoa p;           // Para inserir novos usuários
    char nomeBusca[50]; // Para capturar o nome a ser removido no case 3
    int op = -1;

    inicializar(&minhaFila);
    
    while (op != 0)
    {
        exibir(&minhaFila);
        // O menu desenhado na tela
        printf("\n========== MENU ==========\n");
        printf("1 - Inserir Pessoa\n");
        printf("2 - Remover do Inicio (Normal)\n");
        printf("3 - Remover por Nome Especifico\n");
        printf("4 - Exibir Fila\n");
        printf("0 - Sair\n");
        printf("Escolha uma opcao: ");
        scanf("%d", &op);

        switch (op)
        {
        case 1:
            printf("\nNome: ");
            scanf("%s", p.nome);
            printf("Idade: ");
            scanf("%d", &p.idade);

            inserir(&minhaFila, p);
            break;

        case 2:
            // Lembra que o remover devolve a pessoa? Vamos guardar em 'p' e imprimir
            p = remover(&minhaFila);

            // Se a idade for diferente de -1, é porque alguém realmente saiu
            if (p.idade != -1)
            {
                printf("\n-> Pessoa removida: %s (%d anos)\n", p.nome, p.idade);
            }
            break;

        case 3:
            printf("\nInforme o nome que deseja remover da fila: ");
            scanf("%s", nomeBusca);

            // Passa a fila e o nome procurado para a sua função especial
            RemoverPessoa(&minhaFila, nomeBusca);
            break;

        case 4:
            exibir(&minhaFila);
            break;

        case 0:
            printf("\nEncerrando o programa...\n");
            break;

        default:
            printf("\nOpcao invalida! Tente novamente.\n");
            break;
        }
    }

    return 0; // O C moderno prefere que o main retorne 0 no final
}
```
