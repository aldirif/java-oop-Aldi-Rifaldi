package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka = 1;
        int angka1 = 1;
        int angka2 = 1;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(angka);
            int sum = angka + angka1 + angka2;
            angka = angka1;
            angka1 = angka2;
            angka2 = sum;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
