import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    Frame frame;
    Panel buttonPanel;
    Label display;
    Button
    btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnEqual, btnPlus, btnMinus, btnMulti, btnDivide;
    String susik="";

    int numOfInput = 0;
    int firstNum = 0;
    int secondNum = 0;
    int result = 0;
    float res = 0.0f;
    String operator = "";

    public Calculator(){
        frame = new Frame ("Calcul");
        buttonPanel=new Panel();
        buttonPanel.setLayout(new GridLayout(4,4));
        display = new Label();
        display.setAlignment(Label.RIGHT);
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnClear = new Button ("C");
        btnEqual = new Button ("=");
        btnPlus = new Button("+");
        btnMinus = new Button("-");
        btnMulti = new Button("*");
        btnDivide = new Button("/");

        // 1번째 줄
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btnMulti);

        //2번째
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btnMinus);

        //3
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btnPlus);

        //4
        buttonPanel.add(btnClear);
        buttonPanel.add(btn0);
        buttonPanel.add(btnDivide);
        buttonPanel.add(btnEqual);
        // 숫자
        btn0. addActionListener(new ActionHandler());
        btn1. addActionListener(new ActionHandler());
        btn2. addActionListener(new ActionHandler());
        btn3. addActionListener(new ActionHandler());
        btn4. addActionListener(new ActionHandler());
        btn5. addActionListener(new ActionHandler());
        btn6. addActionListener(new ActionHandler());
        btn7. addActionListener(new ActionHandler());
        btn8. addActionListener(new ActionHandler());
        btn9. addActionListener(new ActionHandler());
        // 부등호
        btnPlus.addActionListener(new ActionHandler());
        btnMinus.addActionListener(new ActionHandler());
        btnDivide.addActionListener(new ActionHandler());
        btnEqual.addActionListener(new ActionHandler());
    }
    public void makeFrame() {
        frame.add(display,"North");
        frame.add(buttonPanel,"Center");

        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.makeFrame();
    }

    private class ActionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String num = e.getActionCommand();
            Button btn = (Button)e.getSource();
            if(btn==btn0){
                System.out.println("btn0");
                if(numOfInput==0){
                    firstNum=Integer.parseInt(num);
                    numOfInput++;

                }else{
                    secondNum=Integer.parseInt(num);
                    numOfInput++;
                }
                susik+=num;
                display.setText(susik);
            }else if (btn==btn1){
                System.out.println("btn1");
                if(numOfInput==0){
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                }else {
                    secondNum=Integer.parseInt(num);
                    numOfInput++;
                }
                susik+=num;
                display.setText(susik);
            }else if (btn==btn2) {
                System.out.println("btn2");
                if (numOfInput == 0) {
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                } else {
                    secondNum = Integer.parseInt(num);
                    numOfInput++;
                }
                susik += num;
                display.setText(susik);
            }else if (btn==btn3) {
                System.out.println("btn3");
                if (numOfInput == 0) {
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                } else {
                    secondNum = Integer.parseInt(num);
                    numOfInput++;
                }
                susik += num;
                display.setText(susik);
            }  else if (btn==btn4) {
                System.out.println("btn4");
                if (numOfInput == 0) {
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                } else {
                    secondNum = Integer.parseInt(num);
                    numOfInput++;
                }
                susik += num;
                display.setText(susik);
            }else if (btn==btn5){
                System.out.println("btn5");
                if(numOfInput==0){
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                }else {
                    secondNum=Integer.parseInt(num);
                    numOfInput++;
                }
                susik+=num;
                display.setText(susik);
            }else if (btn==btn6){
                System.out.println("btn6");
                if(numOfInput==0){
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                }else {
                    secondNum=Integer.parseInt(num);
                    numOfInput++;
                }
                susik+=num;
                display.setText(susik);
            }else if (btn==btn7){
                System.out.println("btn7");
                if(numOfInput==0){
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                }else {
                    secondNum=Integer.parseInt(num);
                    numOfInput++;
                }
                susik+=num;
                display.setText(susik);
            }else if (btn==btn8){
                System.out.println("btn8");
                if(numOfInput==0){
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                }else {
                    secondNum=Integer.parseInt(num);
                    numOfInput++;
                }
                susik+=num;
                display.setText(susik);
            }else if (btn==btn9){
                System.out.println("btn9");
                if(numOfInput==0){
                    firstNum = Integer.parseInt(num);
                    numOfInput++;
                }else {
                    secondNum=Integer.parseInt(num);
                    numOfInput++;
                }
                susik+=num;
                display.setText(susik);
            }

            if(btn==btnPlus){
                susik+="+";
                operator="+";
                display.setText(susik);
            }else if(btn==btnMinus){
                susik+="-";
                operator="-";
                display.setText(susik);
            }else if(btn==btnMulti){
                susik+="*";
                operator="*";
                display.setText(susik);
            }else if(btn==btnDivide){
                susik+="/";
                operator="/";
                display.setText(susik);
            }else if(btn==btnClear){
                numOfInput=0;
                susik+="";
                operator="";
                display.setText("0");
            }else if(btn==btnEqual){
                System.out.println("firstNum:" + firstNum);
                System.out.println("SecondNum:" + secondNum);

                if (numOfInput==2){
                    if(operator.equals("+")){
                        result=firstNum+secondNum;
                    } else if (operator.equals("-")) {
                        result=firstNum-secondNum;
                    } else if (operator.equals("*")) {
                        result=firstNum*secondNum;
                    } else if (operator.equals("/")) {
                        res=((float)firstNum)/secondNum;
                    }
                    if(!operator.equals("/")){
                        susik=Integer.toString(result);
                    }else{
                        susik=Float.toString(res);
                    }
                    display.setText(susik);
                    susik="";
                    numOfInput=0;
                }
            }
        }
    }
}
