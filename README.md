# Fila Inteligente - Inovação para o SUS (Hackaton Fase 5)

## 📋 Sobre o Projeto
Este projeto foi desenvolvido como o desafio final (Hackaton) da pós-graduação em **Arquitetura e Desenvolvimento Java** da FIAP. O objetivo principal é criar soluções tecnológicas inovadoras que contribuam para a otimização do atendimento no Sistema Único de Saúde (SUS), promovendo maior eficiência, agilidade e qualidade nos serviços de saúde.

A solução foca no pilar de **Triagem e Acolhimento Inteligente**, utilizando sistemas que auxiliam na priorização de atendimentos, reduzem a superlotação e direcionam rapidamente os pacientes mais urgentes.

## 🚀 Tecnologias Utilizadas
O projeto utiliza uma arquitetura baseada em microsserviços e comunicação assíncrona:
* **Java**: Linguagem principal para o desenvolvimento do back-end.
* **PostgreSQL**: Banco de dados relacional para persistência de dados.
* **RabbitMQ**: Message Broker (com interface de gestão) para comunicação entre os serviços.
* **Docker & Docker Compose**: Para orquestração de containers e padronização do ambiente.

## 🏗️ Arquitetura do Sistema
Conforme definido na configuração do ambiente via Docker Compose, o ecossistema é composto pelos seguintes serviços:
* **postgres**: Banco de dados central do sistema (Porta 5432).
* **rabbitmq**: Responsável pela mensageria e integração assíncrona (Portas 5672, 15672).
* **fila-service**: Microsserviço responsável pela lógica de negócio da fila inteligente (Porta 8080).
* **notification-service**: Microsserviço responsável pelo processamento e envio de notificações (Porta 8081).

## ⚙️ Como Executar
Para subir o ambiente completo, é necessário ter o Docker instalado e seguir os passos abaixo:

1. Clone o repositório.
2. Execute o comando na pasta fila-inteligente:
   ```bash
   docker-compose up --build

**Autores**

* José Franklin Miranda Gomes Leite RA 361614
* Vitor Henrique dos Santos  RA 361617

**VIDEOS**
* PITCH https://youtu.be/8QJJsKSFVUw
* MVP https://youtu.be/2HFyjKCFB9I

* DOCUMENTO PDF MVP
* https://github.com/joseleite550/fila-inteligente/blob/main/Relatorio_Fila_Inteligente_SUS.pdf
