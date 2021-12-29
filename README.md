# The Good, the Bad and the Ugly

## Rules
A small evolutionary thought experiment.
Let's say we have a population of mutants and let's assume following:
1. Each mutant has 3 traits: `goodness`, `badness` and `ugliness`. Let's call mutants with dominant `goodness` trait `good`, `badness` trait `bad`, `ugliness` trait `ugly`. When a mutant has two or more equal traits, it has equal chance to choose any of these traits to be a dominant one at the beginning of the iteration;
2. Mutants interact with each other. Each mutant can interact with only given `INTERACTIONS NUMBER` number of other mutants;
3. When two `good` mutants encounter one another, they do not fight and accumulate `REWARD UNIT` / 2;  
4. When two `bad` mutants encounter one another, they fight and the mutant with higher `badness` trait beats another one. In case both have the same badness, they both loose;
5. When a `good` mutant and a `bad` mutant encounter one another, `bad` mutant beats a `good` one;  
6. When an `ugly` mutant encounters `good` mutant, it acts as a `good` mutant. When an `ugly` mutant encounters a `bad` mutant, it acts as a `bad` mutant;
7. When two `ugly` mutants encounter one another, they do nothing;
8. When one mutant beats another, the winner mutant accumulates its reward by `REWARD UNIT` and decreases accumulated reward by `REWARD UNIT` of the beaten mutant;  
9. In the end of each iteration a die is rolled and thus the percentage of surviving mutants is determined. Only mutants with the highest accumulated reward survive;   
10. After that, each mutant reproduces in `REPRODUCTION NUMBER` of new mutants, which mutate their traits with a factor of `MUTATION FACTOR`.

I expect following to be true:  
1. Most of the time, `good` mutants will be a dominant variant in the  population;
2. `ugly` mutants will not disappear and will be the least represented variant in the population most of the time. 

Simulation parameters derived from the rules:  
`INTERACTIONS NUMBER`, `REWARD UNIT`, `REPRODUCTION NUMBER`, `MUTATION FACTOR`.

## Simulation

Simulation is not yet complete.