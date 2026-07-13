#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

typedef struct NOH
{
    char letter;
    struct NOH *next;
    struct NOH *previous;
} *tipolist;

// Cria um novo nó com um caractere
tipolist createItem(char letter)
{
    tipolist newItem = malloc(sizeof(struct NOH));
    if (newItem == NULL)
        return NULL;

    newItem->letter = letter;
    newItem->previous = NULL;
    newItem->next = NULL;
    return newItem;
}

tipolist insertEnd(tipolist list, char letter)
{
    tipolist newItem = createItem(letter);
    if (list == NULL)
        return newItem;

    tipolist aux = list;
    while (aux->next != NULL)
    {
        aux = aux->next;
    }
    aux->next = newItem;
    newItem->previous = aux;
    return list;
}

// Verifica se é vogal (retorna 1 se sim, 0 se não)
int vowel(char letter)
{
    char l = tolower(letter);
    if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')
        return 1;
    return 0;
}

// Função para exibir a lista (ajuda a visualizar a criptografia)
void display(tipolist list)
{
    tipolist aux = list;
    while (aux != NULL)
    {
        printf("%c", aux->letter);
        aux = aux->next;
    }
    printf("\n");
}

tipolist swapContent(tipolist l1, tipolist l2){

    char temp = l1->letter;
    l1->letter = l2->letter;
    l2->letter = temp;
}

tipolist reverseRange(tipolist start, tipolist end){
    while(start != end && start->previous != end){
        swapContent(start, end);
        start = start->next;
        end = end->previous;
    }
}

tipolist reverseGlobal(tipolist list){
    if(list == NULL){
        return 0;
    }else{
        tipolist start = list;
        tipolist end = list;

        while(end->next != NULL){
            end = end->next;
        }
        while(start != end && start->previous != end){
            swapContent(start, end);
            
            start = start->next; // move forward
            end = end->previous; //move backward
        }
    }

}
tipolist encrypted(tipolist list)
{
    if (list == NULL)
        return NULL;

       list = reverseGlobal(list);
       tipolist aux = list;

       while(aux!=NULL){
        if(vowel(aux->letter) == 0){
            tipolist start = aux; //inicio da sequencia de consoante

            while(aux->next != NULL && vowel(aux->next->letter)==0){
                aux = aux->next;
            }
            tipolist end = aux;
            reverseRange(start, end);
        }
        aux = aux->next;
       }

    return list;
}

int main()
{
    tipolist list = NULL;
    char buffer[100];
    int op = -1;

    while (op != 0)
    {

        display(list);
        printf("\n1 - Insert phrase\n2 - Display List\n3 - Encrypt\n0 - Sair\n");
        scanf("%d", &op);
        getchar(); // Limpa o buffer do enter

        switch (op)
        {
        case 1:
            printf("Digite a frase: ");
            fgets(buffer, 100, stdin);
            buffer[strcspn(buffer, "\n")] = '\0'; // Remove o \n final
            for (int i = 0; buffer[i] != '\0'; i++)
            {
                list = insertEnd(list, buffer[i]);
            }
            break;
        case 2:
            display(list);
            break;
        case 3:
            list = encrypted(list);
            printf("Lista criptografada!\n");
            break;
        }
    }
    return 0;
}