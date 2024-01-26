package mini.proje;

import static mini.proje.months.*;

public class MiniProjeTest {
      public static void main(String[] args) {
        Value[] integerValue={new IntegerValue(11),new IntegerValue(12),new IntegerValue(7),new IntegerValue(6)};
        Value target= new IntegerValue(41);
        target.run(integerValue, target);
          
        Value[] integerValue2={new IntegerValue(23),new IntegerValue(1012),new IntegerValue(48),new IntegerValue(7)};
        Value target2= new IntegerValue(6050);
        target2.run(integerValue2, target2);
        
        Value[] integerValue3={new IntegerValue(3),new IntegerValue(4),new IntegerValue(5)};
        Value target3= new IntegerValue(120);
        target3.run(integerValue3, target3);
        
        Value[] integerValue4={new IntegerValue(81)};
        Value target4= new IntegerValue(81);
        target4.run(integerValue4, target4);
        
        Value[] integerValue5={new MonthValue(December),new StringValue("DECEMBER"),new IntegerValue(3),new IntegerValue(6)};
        Value target5= new IntegerValue(1);
        target5.run(integerValue5, target5);
        
        Value[] integerValue6={new MonthValue(May),new StringValue("MAY"),new MonthValue(January),new StringValue("January")};
        Value target6= new IntegerValue(100);
        target6.run(integerValue6, target6);
        
        Value[] integerValue7={new IntegerValue(2),new IntegerValue("ANKARA"),new StringValue(""),new IntegerValue(6)};
        Value target7= new IntegerValue(4);
        target7.run(integerValue7, target7);
        
        Value[] integerValue8={new IntegerValue(Integer.MAX_VALUE),new IntegerValue(Integer.MIN_VALUE),new IntegerValue(800),new IntegerValue(9)};
        Value target8= new IntegerValue(0);
        target8.run(integerValue8, target8);
        
        Value[] integerValue9={new IntegerValue(-75),new IntegerValue(9),new IntegerValue(91),new IntegerValue(70)};
        Value target9= new IntegerValue(-0);
        target9.run(integerValue9, target9);
        
        Value[] integerValue10={new IntegerValue(12),new IntegerValue(7),new IntegerValue(6)};
        Value target10= new IntegerValue(-63);
        target10.run(integerValue10, target10);
        
        //-----------------------
        
        Value[]stringValue={new StringValue("A")};
        Value target11= new StringValue("A");
        target11.run(stringValue, target11);
        
        Value[]stringValue2={new StringValue("A")};
        Value target12= new StringValue("B");
        target12.run(stringValue2, target12);
        
        Value[]stringValue3={new StringValue("F")};
        Value target13= new StringValue("C");
        target13.run(stringValue3, target13);
        
        Value[]stringValue4={new StringValue("C"),new StringValue("D")};
        Value target14= new StringValue("DC");
        target14.run(stringValue4, target14);
        
        Value[]stringValue5={new StringValue("D"),new StringValue("C")};
        Value target15= new StringValue("CD");
        target15.run(stringValue5, target15);
        
        Value[]stringValue6={new StringValue("NARA"),new StringValue("A")};
        Value target16= new StringValue("NR");
        target16.run(stringValue6, target16);
        
        Value[]stringValue7={new StringValue("N"),new StringValue("A"),new StringValue("R"),new StringValue("A")};
        Value target17= new StringValue("NARA");
        target17.run(stringValue7, target17);
        
        Value[]stringValue8={new StringValue("NA"),new StringValue("AR")};
        Value target18= new StringValue("NARA");
        target18.run(stringValue8, target18);
        
        Value[]stringValue9={new StringValue("ANKARA"),new StringValue("DENIZ"),new StringValue("KARA"),new StringValue("A")};
        Value target19= new StringValue("N");
        target19.run(stringValue9, target19);
        
        Value[]stringValue10={new StringValue(" "),new StringValue("A"),new StringValue("B")};
        Value target20= new StringValue(" BAB");
        target20.run(stringValue10, target20);

        Value[]stringValue11={new StringValue(" "),new StringValue("NE"),new StringValue("MUTLU"),new StringValue("TURKUM"),new StringValue("DIYENE"),new StringValue(" "),new StringValue(" ")};
        Value target21= new StringValue("NE MUTLU TURKUM DIYENE");
        target21.run(stringValue11, target21);

        Value[]stringValue12={new StringValue("AB"),new StringValue("B"),new StringValue("A"),new StringValue("A")};
        Value target22= new StringValue("AAAA");
        target22.run(stringValue12, target22);
        
        Value[]stringValue13={new IntegerValue(1),new StringValue("A"),new MonthValue(May)};
        Value target23= new StringValue("NARA");
        target23.run(stringValue13, target23);
        
        Value[]stringValue14={new IntegerValue("NA"),new MonthValue("A"),new StringValue("R"),new StringValue("A"),new MonthValue(May)};
        Value target24= new StringValue("NARA");
        target24.run(stringValue14, target24);
        
        //-------------------------
        
        
        Value[]monthValue1={new MonthValue(June),new MonthValue(July),new MonthValue(February)};
        Value target25= new MonthValue(August);
        target25.run(monthValue1, target25);

        Value[]monthValue2={new MonthValue(September),new MonthValue(October),new MonthValue(November)};
        Value target26= new MonthValue(May);
        target26.run(monthValue2, target26);

        Value[]monthValue3={new StringValue("May"),new StringValue("May"),new StringValue("February")};
        Value target27= new MonthValue(August);
        target27.run(monthValue3, target27);

        Value[]monthValue4={new IntegerValue(3),new IntegerValue(4)};
        Value target28= new MonthValue(July);
        target28.run(monthValue4, target28);

        Value[]monthValue5={new MonthValue(March),new StringValue("AYBU"),new IntegerValue(81)};
        Value target29= new MonthValue(August);
        target29.run(monthValue5, target29);

        Value[]monthValue6={new MonthValue(April)};
        Value target30= new MonthValue(April);
        target30.run(monthValue6, target30);
        
        Value[]monthValue7={new MonthValue(December),new MonthValue(December)};
        Value target31= new MonthValue(January);
        target31.run(monthValue7, target31);

        Value[]monthValue8={new MonthValue(January),new MonthValue(January),new MonthValue(January)};
        Value target32= new MonthValue(March);
        target32.run(monthValue8, target32);

        Value[]monthValue9={new MonthValue(April),new MonthValue(May)};
        Value target33= new MonthValue(August);
        target33.run(monthValue9, target33);

        Value[]monthValue10={new MonthValue(May),new MonthValue(September),new MonthValue(January)};
        Value target34= new MonthValue(null);
        target34.run(monthValue10, target34);
        
        }
    }



