package assessment2.question1;

import java.util.Scanner;

abstract class Arithmetic {
int num1, num2, result;
public abstract int calculate(int num1, int num2);


public int getNum1() {
return num1;
}


public void setNum1(int num1) {
this.num1 = num1;
}


public int getNum2() {
return num2;
}


public void setNum2(int num2) {
this.num2 = num2;
}
}