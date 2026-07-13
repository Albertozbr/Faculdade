#include <stdio.h>
#include <locale.h> // Para não quebrar os acentos no terminal

// Função para ler a entrada e evitar o loop infinito com letras
int lerOpcaoSegura()
{
    int op;
    // Se o scanf não conseguir ler 1 item (um número inteiro), ele entra no if
    if (scanf("%d", &op) != 1)
    {
        // Limpa o buffer do teclado até encontrar uma quebra de linha (Enter)
        while (getchar() != '\n')
            ;
        return -1; // Retorna um valor inválido genérico para cair nos "else" de opção inválida
    }
    return op;
}

// Valida a dentição se não for carnívoro marinho grande
void verificarDentesMamiferos()
{
    int opcao;

    printf("Caninos maiores?\n");
    printf("1 - Sim\n");
    printf("2 - Não\n");
    printf("Opção: ");
    opcao = lerOpcaoSegura();

    if (opcao == 1)
    {
        printf("Ordem Carnivora\n");
    }
    else if (opcao == 2)
    {
        printf("Dois pares de incisivos?\n");
        printf("1 - Sim\n");
        printf("2 - Não\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("Ordem Lagomorpha\n");
        }
        else if (opcao == 2)
        {
            printf("Ordem Rodentia\n");
        }
        else
        {
            printf("Opção inválida.\n");
        }
    }
    else
    {
        printf("Opção inválida.\n");
    }
}

// Checa tamanho das garras e se o bicho é do mar
void garrasLongasDedos()
{
    int opcao;

    printf("Garras longas; poucos dedos?\n");
    printf("1 - Sim\n");
    printf("2 - Não\n");
    printf("Opção: ");
    opcao = lerOpcaoSegura();

    if (opcao == 1)
    {
        printf("Ordem Pilosa\n");
    }
    else if (opcao == 2)
    {
        printf("Maior que 50 kg e marinho?\n");
        printf("1 - Sim\n");
        printf("2 - Não\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("Carnivora (Pinípedes)\n");
        }
        else if (opcao == 2)
        {
            verificarDentesMamiferos();
        }
        else
        {
            printf("Opção inválida.\n");
        }
    }
    else
    {
        printf("Opção inválida.\n");
    }
}

// Separa os bichos por cascos ou unhas/garras
void verificaCascosOuGarras()
{
    int opcao;

    printf("Possui cascos?\n");
    printf("1 - Sim\n");
    printf("2 - Não\n");
    printf("Opção: ");
    opcao = lerOpcaoSegura();

    if (opcao == 1)
    {
        printf("Possui dedos ímpares?\n");
        printf("1 - Sim\n");
        printf("2 - Não\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("Ordem Perissodactyla\n");
        }
        else if (opcao == 2)
        {
            printf("Ordem Artiodactyla\n");
        }
        else
        {
            printf("Opção inválida.\n");
        }
    }
    else if (opcao == 2)
    {
        printf("Hálux com unha?\n");
        printf("1 - Sim\n");
        printf("2 - Não\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("Hálux oponível; focinho longo?\n");
            printf("1 - Sim\n");
            printf("2 - Não\n");
            printf("Opção: ");
            opcao = lerOpcaoSegura();

            if (opcao == 1)
            {
                printf("Ordem Didelphimorphia\n");
            }
            else if (opcao == 2)
            {
                printf("Ordem Primates\n");
            }
            else
            {
                printf("Opção inválida.\n");
            }
        }
        else if (opcao == 2)
        {
            garrasLongasDedos();
        }
        else
        {
            printf("Opção inválida.\n");
        }
    }
    else
    {
        printf("Opção inválida.\n");
    }
}

// Início da árvore de mamíferos
void mamiferos()
{
    int opcao;

    printf("\nSua espécie pertence aos Mamíferos Brasileiros\n");
    printf("Possui membros traseiros ausentes; nadadeira caudal?\n");
    printf("1 - Sim\n");
    printf("2 - Não\n");
    printf("Opção: ");
    opcao = lerOpcaoSegura();

    if (opcao == 1)
    {
        printf("Possui narinas anteriores?\n");
        printf("1 - Sim\n");
        printf("2 - Não\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("Ordem Sirenia\n");
        }
        else if (opcao == 2)
        {
            printf("Ordem Artiodactyla (Cetáceos)\n");
        }
        else
        {
            printf("Opção inválida.\n");
        }
    }
    else if (opcao == 2)
    {
        printf("Possui membros anteriores em asas?\n");
        printf("1 - Sim\n");
        printf("2 - Não\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("Ordem Chiroptera\n");
        }
        else if (opcao == 2)
        {
            printf("Possui presença de carapaça?\n");
            printf("1 - Sim\n");
            printf("2 - Não\n");
            printf("Opção: ");
            opcao = lerOpcaoSegura();

            if (opcao == 1)
            {
                printf("Ordem Cingulata\n");
            }
            else if (opcao == 2)
            {
                verificaCascosOuGarras();
            }
            else
            {
                printf("Opção inválida.\n");
            }
        }
        else
        {
            printf("Opção inválida.\n");
        }
    }
    else
    {
        printf("Opção inválida.\n");
    }
}

// Chave para identificar as famílias dos lagartos
void lagartos()
{
    int opcao;

    printf("\n1A. Corpo serpentiforme, membros anteriores ausentes, os posteriores vestigiais, em formato de folha; aspecto brilhante metálico?\n");
    printf("1 - Possui\n");
    printf("2 - Não possui\n");
    printf("Opção: ");
    opcao = lerOpcaoSegura();

    if (opcao == 1)
    {
        printf("\nO lagarto é da família ANGUIDAE (Ophiodes)\n");
        return; // Retorna imediatamente, saindo da função
    }
    else if (opcao != 2)
    {
        printf("\nOpção inválida.\n");
        return;
    }

    printf("\nOk! Então há presença de membros anteriores e posteriores.\n");

    printf("\n2A. Corpo com escamas arredondadas, aspecto brilhante metálico; membros curtos?\n");
    printf("1 - Possui\n");
    printf("2 - Não possui\n");
    printf("Opção: ");
    opcao = lerOpcaoSegura();

    if (opcao == 1)
    {
        printf("\n3A. Corpo com faixas transversais?\n");
        printf("1 - Possui\n");
        printf("2 - Não possui\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("\nO lagarto é da família ANGUIDAE (Diploglossus)\n");
            return;
        }
        else if (opcao == 2)
        {
            printf("\n3B. Corpo sem linhas transversais, mas usualmente com linhas longitudinais e uma faixa negra ao longo de cada lado?\n");
            printf("1 - Possui\n");
            printf("2 - Não possui\n");
            printf("Opção: ");
            opcao = lerOpcaoSegura();

            if (opcao == 1)
            {
                printf("\nO lagarto é da família MABUYIDAE\n");
                return;
            }
            else if (opcao == 2)
            {
                printf("\nO lagarto não existe.\n");
                return;
            }
            else
            {
                printf("\nOpção inválida.\n");
                return;
            }
        }
        else
        {
            printf("\nOpção inválida.\n");
            return;
        }
    }
    else if (opcao == 2)
    {
        printf("\nOk! Então o lagarto tem corpo sem escamas de aspecto brilhante metálico.\n");

        printf("\n4A. Pálpebras ausentes; escamas granulares no topo da cabeça e no corpo; dedos alargados em algumas espécies, com lâminas transversais adesivas.\n");
        printf("1 - Possui\n");
        printf("2 - Não possui\n");
        printf("Opção: ");
        opcao = lerOpcaoSegura();

        if (opcao == 1)
        {
            printf("\nO lagarto é da família GEKKONIDAE + PHYLLODACTYLIDAE + SPHAERODACTYLIDAE\n");
            return;
        }
        else if (opcao == 2)
        {
            printf("\nOk! Então ele tem pálpebras presentes; escamas do topo da cabeça grandes ou pequenas, mas não granulares.\n");

            printf("\n5A. Escamas grandes no dorso da cabeça, em número relativamente baixo e arranjadas de forma regular, formando placas?\n");
            printf("1 - Possui\n");
            printf("2 - Não possui\n");
            printf("Opção: ");
            opcao = lerOpcaoSegura();

            if (opcao == 1)
            {
                printf("\n6A. Escamas dorsais bem menores que as ventrais?\n");
                printf("1 - Sim\n");
                printf("2 - Não\n");
                printf("Opção: ");
                opcao = lerOpcaoSegura();

                if (opcao == 1)
                {
                    printf("\nO lagarto é da família TEIIDAE\n");
                }
                else if (opcao == 2)
                {
                    printf("\nO lagarto é da família ALOPOGLOSSIDAE + GYMNOPHTHALMIDAE\n");
                }
                else
                {
                    printf("\nOpção inválida.\n");
                }
                return;
            }
            else if (opcao == 2) // Escamas bagunçadas/irregulares
            {
                printf("\n7A. Presença de crista vertebral, crista gular e escama gular?\n");
                printf("1 - Possui\n");
                printf("2 - Não possui\n");
                printf("Opção: ");
                opcao = lerOpcaoSegura();

                if (opcao == 1)
                {
                    printf("\nO lagarto é da família IGUANIDAE (Iguana)\n");
                    return;
                }
                else if (opcao == 2)
                {
                    printf("\n8A. Cauda curta e muito espinhosa, e crista vertebral ausente (Hoplocercus); ou com cauda longa e sem espinhos, e crista vertebral presente, com escamas bem mais altas que largas, especialmente na nuca (Enyalioides)?\n");
                    printf("1 - Possui\n");
                    printf("2 - Não possui\n");
                    printf("Opção: ");
                    opcao = lerOpcaoSegura();

                    if (opcao == 1)
                    {
                        printf("\nO lagarto é da família HOPLOCERCIDAE\n");
                        return;
                    }
                    else if (opcao == 2)
                    {
                        printf("\n9A. Escamas do corpo quilhadas, de aspecto áspero?\n");
                        printf("1 - Sim\n");
                        printf("2 - Não\n");
                        printf("Opção: ");
                        opcao = lerOpcaoSegura();

                        if (opcao == 1)
                        {
                            printf("\n10A. Escama interparietal geralmente grande (igual ou maior que 1/5 da largura da cabeça e muitas vezes maior que qualquer escama adjacente)?\n");
                            printf("1 - Sim\n");
                            printf("2 - Não\n");
                            printf("Opção: ");
                            opcao = lerOpcaoSegura();

                            if (opcao == 1)
                            {
                                printf("\nO lagarto é da família TROPIDURIDAE\n");
                            }
                            else if (opcao == 2)
                            {
                                printf("\nO lagarto é da família LIOLAEMIDAE\n");
                            }
                            else
                            {
                                printf("\nOpção inválida.\n");
                            }
                            return;
                        }
                        else if (opcao == 2)
                        {
                            printf("\n11A. Focinho curto; crista vertebral presente ou ausente; ausência de leque gular (\"papo\")?\n");
                            printf("1 - Sim\n");
                            printf("2 - Não\n");
                            printf("Opção: ");
                            opcao = lerOpcaoSegura();

                            if (opcao == 1)
                            {
                                printf("\nO lagarto é da família LEIOSAURIDAE\n");
                            }
                            else if (opcao == 2)
                            {
                                printf("\n12A. Dedos alargados, com lâminas transversais adesivas; quarto dedo do pé maior que o terceiro; leque gular presente, mais desenvolvido em machos?\n");
                                printf("1 - Sim\n");
                                printf("2 - Não\n");
                                printf("Opção: ");
                                opcao = lerOpcaoSegura();

                                if (opcao == 1)
                                {
                                    printf("\nO lagarto é da família DACTYLOIDAE\n");
                                }
                                else if (opcao == 2)
                                {
                                    printf("\nO lagarto é da família POLYCHROTIDAE\n");
                                }
                                else
                                {
                                    printf("\nOpção inválida.\n");
                                }
                            }
                            else
                            {
                                printf("\nOpção inválida.\n");
                            }
                            return;
                        }
                        else
                        {
                            printf("\nOpção inválida.\n");
                            return;
                        }
                    }
                    else
                    {
                        printf("\nOpção inválida.\n");
                        return;
                    }
                }
                else
                {
                    printf("\nOpção inválida.\n");
                    return;
                }
            }
            else
            {
                printf("\nOpção inválida.\n");
                return;
            }
        }
        else
        {
            printf("\nOpção inválida.\n");
            return;
        }
    }
    else
    {
        printf("\nOpção inválida.\n");
        return;
    }
}

// Onde o programa roda
int main()
{
    // Força o terminal a aceitar os acentos
    setlocale(LC_ALL, "");

    int opcao = -1;

    printf("------- Chave para Identificação das Famílias de Lagartos e Mamíferos do Brasil -------\n");

    while (opcao != 0)
    {
        printf("\nA espécie possui pelos no corpo (mesmo que em pouca quantidade) ou glândulas mamárias?\n");
        printf("1 - Sim\n");
        printf("2 - Não\n");
        printf("0 - Sair\n");
        printf("Opção: ");

        opcao = lerOpcaoSegura();

        switch (opcao)
        {
        case 1:
            mamiferos();
            break;

        case 2:
            lagartos();
            break;

        case 0:
            printf("\nSaindo...\n");
            return 0;

        default:
            printf("\nOpção inválida. Tente novamente.\n");
            break;
        }
    }

    return 0;
}