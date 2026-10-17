# M22 — Tipos de Data, Hora e Enums

Atividade prática do curso **EBAC Back-end Java v2**, explorando a API moderna de data e hora do Java e a representação de valores fixos com `enum`.

## O que o programa demonstra

- Obtém a data e hora atuais usando `LocalDateTime`.
- Converte o dia da semana para o enum personalizado `DiaDaSemana`.
- Cria um objeto `Evento` com nome, data/hora e dia da semana.
- Calcula uma nova data cinco dias à frente.
- Apresenta a data e hora associadas aos fusos `America/Sao_Paulo` e `GMT` usando `ZonedDateTime`.

## Conceitos praticados

- `LocalDateTime`, `DayOfWeek`, `ZoneId` e `ZonedDateTime`.
- Enum personalizado.
- `switch` para mapear valores.
- Construtores, atributos e métodos de uma classe de domínio.
- Operações de data com `plusDays()`.

## Como executar

Abra o projeto no IntelliJ IDEA e execute `src/DataHoraMain.java).

## Observação

A saída depende da data e hora em que o programa é executado. `LocalDateTime` não carrega fuso horário por si só; o exercício associa a data/hora a zonas explicitamente ao criar os objetos `ZonedDateTime`.

---

**Curso:** EBAC — Back-end Java v2  
**Tema:** API Date/Time e enums
