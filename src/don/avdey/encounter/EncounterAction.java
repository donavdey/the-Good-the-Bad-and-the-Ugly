package don.avdey.encounter;

import don.avdey.mutant.Mutant;

public enum EncounterAction {
    COOPERATE {
        public void doAction(Mutant self, Mutant other, int reward) {
            self.setAccumulatedReward(self.getAccumulatedReward() + reward / 2);
            other.setAccumulatedReward(other.getAccumulatedReward() + reward / 2);
        }
    },
    BEAT {
        public void doAction(Mutant self, Mutant other, int reward) {
            self.setAccumulatedReward(self.getAccumulatedReward() + reward);
            other.setAccumulatedReward(other.getAccumulatedReward() - reward);
        }
    },
    SURRENDER {
        public void doAction(Mutant self, Mutant other, int reward) {
            self.setAccumulatedReward(self.getAccumulatedReward() - reward);
            other.setAccumulatedReward(other.getAccumulatedReward() + reward);
        }
    },
    FIGHT {
        public void doAction(Mutant self, Mutant other, int reward) {
            if (self.getBadness() > other.getBadness()) {
                self.setAccumulatedReward(self.getAccumulatedReward() + reward);
                other.setAccumulatedReward(other.getAccumulatedReward() - reward);
            } else if (self.getBadness() < other.getBadness()) {
                self.setAccumulatedReward(self.getAccumulatedReward() - reward);
                other.setAccumulatedReward(other.getAccumulatedReward() + reward);
            } else {
                self.setAccumulatedReward(self.getAccumulatedReward() - reward);
                other.setAccumulatedReward(other.getAccumulatedReward() - reward);
            }
        }
    },
    IGNORE {
        public void doAction(Mutant self, Mutant other, int reward) {
            // do nothing
        }
    };

    public abstract void doAction(Mutant self, Mutant other, int reward);
}
