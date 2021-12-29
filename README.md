# The Good, the Bad and the Ugly

A small evolutionary thought experiment.
Let's say we have a population of mutants and let's assume following:
1. Each mutant has 3 traits: `goodness`, `badness` and `ugliness`. Let's call mutants with dominant `goodness` trait `good`, `badness` trait `bad`, `ugliness` trait `ugly`;
2. Let's call the mutant with two or more equal traits `mimic`. Such mutant can choose any of such equal traits to be dominant based on the situation;
3. Mutants interact with each other. Each mutant can interact with only given `Interaction Number` number of other mutants;
4. `good` mutant beats `bad` mutant, `bad` mutant beats `ugly` mutant, `ugly` mutant beats `good` mutant;
5. When one mutant beats another, it accumulates its reword by `REWARD UNIT` and decreases accumulated reword by `REWARD UNIT` of the beaten mutant;
6. When two `good` mutants encounter one another, they do not fight and accumulate `REWARD UNIT` / 2;  
7. When two `bad` mutants encounter one another, they fight and the mutant with higher `badness` trait wins;  
8. When two `ugly` mutants encounter one another, they do not fight and decrease accumulated `REWARD UNIT` / 2;  
9. When two `mimic` mutants encounter one another, they do nothing;
10. In the end of each iteration a die is rolled and thus the percentage of surviving mutants is determined. Only mutants with the highest accumulated reward survive;   
11. After that, each mutant reproduces in `REPRODUCTION NUMBER` of new mutants, which mutate their traits with a factor of `MUTATION FACTOR`.

I expect following to be true:  
1. Most of the time, `good` mutants will be a dominant variant in the  population;
2. `ugly` mutants will not disappear and will remain their numbers relatively small;  
3. `mimic` mutants will also not disappear, and most of the time will be the least represented variant in the population.

Simulation parameters derived from the rules:  
`Interaction Number`, `REWARD UNIT`, `REPRODUCTION NUMBER`, `MUTATION FACTOR`. Let's roll a die at step 10 in `GAUSIAN` manner.