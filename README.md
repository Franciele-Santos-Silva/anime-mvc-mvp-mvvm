# AnimeAppArquiteturas

Projeto desenvolvido para estudo das arquiteturas de software:

- MVC (Model-View-Controller)
- MVP (Model-View-Presenter)
- MVVM (Model-View-ViewModel) 

## Objetivo

O objetivo do projeto é comparar na prática diferentes arquiteturas de software aplicadas a um sistema simples de cadastro e listagem de animes.

Cada arquitetura implementa a mesma funcionalidade com estruturas diferentes.

## Estrutura do Projeto

# MVC (Model-View-Controller)

- `Model`: representa os dados 
- `View`: interface com o usuário 
- `Controller`: controla a lógica do sistema
- `Main`: ponto de entrada do sistema

✔ Implementado com lista de animes  
✔ Cadastro e listagem via console

# MVP (Model-View-Presenter)

- `Model`: estrutura dos dados
- `View`: responsável apenas pela interface
- `Presenter`: controla toda a lógica da aplicação
- `Main`: inicializa a aplicação

✔ Separação mais clara entre lógica e interface  
✔ View mais simples

# MVVM (Model-View-ViewModel)

Arquitetura será implementada posteriormente com:

- Model
- View
- ViewModel

## Funcionalidades

- Adicionar anime
- Listar animes
- Interface via console
- Separação de responsabilidades por arquitetura

## Tecnologias

- Java
- IntelliJ IDEA
- Console (Scanner)