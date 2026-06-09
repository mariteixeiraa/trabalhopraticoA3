# Levantamento e Análise de Requisitos

## Contexto
O sistema será desenvolvido para apoiar clínicas populares e pequenos consultórios que ainda realizam o agendamento de consultas de forma manual. O objetivo é digitalizar parte desse processo, trazendo mais organização e confiabilidade.

---

## Requisitos Funcionais

- **Cadastro de Pacientes**  
  *Como recepcionista, quero cadastrar pacientes com nome, CPF e telefone, para que eu possa organizar os atendimentos.*

- **Cadastro de Médicos**  
  *Como administrador, quero cadastrar médicos com nome, especialidade e CRM, para que eu possa associar consultas a eles.*

- **Agendamento de Consultas**  
  *Como recepcionista, quero agendar consultas em horários disponíveis, para evitar conflitos de agenda.*

- **Cancelamento de Consultas**  
  *Como paciente, quero cancelar uma consulta previamente marcada, para liberar o horário.*

- **Consulta da Agenda**  
  *Como administrador, quero visualizar todas as consultas agendadas, para ter controle sobre os atendimentos.*

---

## Requisitos Não Funcionais

- O sistema deve ser implementado em **Java**.  
- Deve seguir os princípios **SOLID**.  
- Deve conter **testes unitários** para validar as principais funcionalidades.  
- Deve aplicar **padrões de projeto** quando adequado.  
- O repositório deve estar organizado e conter documentação clara.  

---

## Atores Envolvidos
- **Recepcionista/Administrador:** responsável por cadastrar pacientes, médicos e organizar a agenda.  
- **Paciente:** responsável por marcar e cancelar consultas.  

---

## Escopo da Primeira Versão
A primeira versão do sistema terá foco no **back-end**, sem interface gráfica completa. O objetivo é demonstrar a aplicação prática dos conceitos de Engenharia de Software, incluindo orientação a objetos, modelagem, testes e padrões de projeto.
