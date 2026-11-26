# Laboration 2 - Personalregister

## Steg 1: Entiteter

- **Anställd** (employee)
- **Avdelning** (department)
- **Passerkort** (access_card)

## Steg 2: Attribut

- **Anställd:** förnamn, efternamn, e-post (unik), anställningsdatum
- **Avdelning:** namn, kontorsort
- **Passerkort:** kortnummer (unikt), utfärdandedatum, sista giltighetsdatum

## Steg 3: Relationer

- **Avdelning -Anställd: en-till-många.** En avdelning kan ha flera eller inga anställda. Varje anställd måste tillhöra
  exakt en avdelning.
- **Anställd -Passerkort: valfri en-till-en.** En anställd kan ha högst ett kort, men behöver inte ha något kort. Varje
  kort tillhör exakt en anställd
