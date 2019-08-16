package com.javatrainer.module3.flowcontrol.examples;

import static java.lang.System.out;

public class FloatingPointArithmetic {
    public static void main(String[] args) {
        FloatingPointArithmetic floatingPointArithmetic = new FloatingPointArithmetic();
        floatingPointArithmetic.numberRespresentations();
        floatingPointArithmetic.numberRepresentationsByHandsOn();
    }


    private String rowStart() {
        return "|";
    }

    private String rowEnd() {
        return "\r\n";
    }

    private String col(int nr, String msg) {
        return String.format("%" + +colPatterns[nr] + "s", msg) + "|";
    }

    private String rowWith(String... columns) {
        StringBuilder buffer = new StringBuilder(rowStart());
        for (int i = 0; i < columns.length; i++) {
            buffer.append(col(i, columns[i]));
        }
        buffer.append(rowEnd());
        return buffer.toString();
    }

    private void numberRespresentations() {
        StringBuilder sb = new StringBuilder();
        sb.append(separatorRow());
        sb.append(rowWith("Name", "Width In Bits", "Minimum Value", "Maximum Value", "Min. Int. Value", "Max. Int. Value"));
        sb.append(separatorRow());
        sb.append(rowWith("byte", "8", String.valueOf(Byte.MIN_VALUE), String.valueOf(Byte.MAX_VALUE), String.valueOf(Byte.MIN_VALUE), String.valueOf(Byte.MAX_VALUE)));
        sb.append(rowWith("short", "16", String.valueOf(Short.MIN_VALUE), String.valueOf(Short.MAX_VALUE), String.valueOf(Short.MIN_VALUE), String.valueOf(Short.MAX_VALUE)));
        sb.append(rowWith("int", "32", String.valueOf(Integer.MIN_VALUE), String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MIN_VALUE), String.valueOf(Integer.MAX_VALUE)));
        sb.append(rowWith("float", "32", String.valueOf(Float.MIN_VALUE), String.valueOf(Float.MAX_VALUE), String.format("%.0f", Float.MIN_VALUE), String.format("%.0f", Float.MAX_VALUE)));
        sb.append(rowWith("long", "64", String.valueOf(Long.MIN_VALUE), String.valueOf(Long.MAX_VALUE), String.valueOf(Long.MIN_VALUE), String.valueOf(Long.MAX_VALUE)));
        sb.append(rowWith("double", "64", String.valueOf(Double.MIN_VALUE), String.valueOf(Double.MAX_VALUE), String.valueOf(Math.round(Double.MIN_VALUE)), String.valueOf(Math.floor(Double.MAX_VALUE))));
        sb.append(separatorRow());
        out.println(sb.toString());

        //->
        System.out.println("PI");
        System.out.println(Long.toBinaryString(Float.floatToIntBits((float) Math.PI)));
        System.out.println(grouped(Long.toBinaryString(Float.floatToRawIntBits((float) Math.PI))));
        System.out.println(fromBinaryFloat(Long.toBinaryString(Float.floatToRawIntBits((float) Math.PI))));

        System.out.println("E");
        System.out.println(Long.toBinaryString(Float.floatToIntBits((float) Math.E)));
        System.out.println(grouped(Long.toBinaryString(Float.floatToRawIntBits((float) Math.E))));
        System.out.println(fromBinaryFloat(Long.toBinaryString(Float.floatToRawIntBits((float) Math.E))));

        int testNr=0b0100_0000_0111_0000_1111_0000_1111_0000;
        System.out.println("Test for binary:" + grouped(Integer.toBinaryString(testNr)) + " which as int is:" + testNr);
        int sign = +1;
        int base = 2;
        float exponent = (float)Math.pow(2,-0);
        float fractionBit1Value=(float)Math.pow(2,-1);
        float fractionBit2Value=(float)Math.pow(2,-2);
        float fractionBit3Value=(float)Math.pow(2,-3);

        float fractionBit8Value=(float)Math.pow(2,-8);
        float fractionBit9Value=(float)Math.pow(2,-9);
        float fractionBit10Value=(float)Math.pow(2,-10);
        float fractionBit11Value=(float)Math.pow(2,-11);


        float fractionBit16Value=(float)Math.pow(2,-16);
        float fractionBit17Value=(float)Math.pow(2,-17);
        float fractionBit18Value=(float)Math.pow(2,-18);
        float fractionBit19Value=(float)Math.pow(2,-19);


        float testNrAsDouble = sign*base*( exponent + fractionBit1Value + fractionBit2Value + fractionBit3Value + fractionBit8Value + fractionBit9Value + fractionBit10Value + fractionBit11Value + fractionBit16Value + fractionBit17Value + fractionBit18Value + fractionBit19Value);

        System.out.printf("Float from bits:%.38f%n",Float.intBitsToFloat(testNr));
        System.out.printf("Float from calculation:%.38f%n",testNrAsDouble);

        int x= 0b111_1111_1111_1111_1111_1111;
        System.out.printf("2 x (int %d) can be represented in float as %f%n", x, (float)(2*x));
        System.out.printf("3 x (int %d) can NOT be represented in float as %f%n", 3*x, (float)(3*x));
    }

    private double fromBinaryFloat(String binaryRepresentation) {
        int fractionLength = 8;
        int exponentFractionBorder = 1 + fractionLength;
        int bias = 127;
        StringBuilder sb = new StringBuilder(binaryRepresentation);
        while (sb.length() < 32) {
            sb.insert(0, '0');
        }
        String exponent = sb.substring(1, exponentFractionBorder);
        int powerMultiplier = Integer.parseInt(exponent, 2) - bias;
        int multiplier = (int) Math.pow(2, powerMultiplier);
        double fraction = 0.0;
        double diff;
        String fractionPart = 1+sb.substring(exponentFractionBorder);
        for (int i = 0; i < fractionPart.length(); i++) {
            if (fractionPart.charAt(i) == '1') {
                diff = Math.pow(2, -i);
                fraction = fraction + diff;
            }
        }
        return fraction * multiplier;
    }

    private String grouped(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.insert(0, s.charAt(i));
            if ((s.length() - i) % 4 == 0) {
                sb.insert(0, '_');
            }
        }
        return sb.toString();
    }

    private String times(char c, int nr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nr; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    private String separatorRow() {
        StringBuilder sb = new StringBuilder();
        for (int colWidth : colPatterns) {
            sb.append('+').append(times('-', colWidth));
        }
        sb.append(String.format("+%n"));
        return sb.toString();
    }

    private void numberRepresentationsByHandsOn() {
        out.println("long size is " + Long.SIZE + " float size is " + Float.SIZE);
        long l64 = 64L;
        float f;
        f = l64;
        final long lMax = Long.MAX_VALUE;
        f = lMax;
        out.println("Max long as long                       " + lMax);
        out.println("Max long as float                      " + f);
//lMax = f; // possible loss of precision error
        long l;
        l = (long) f;
        out.println("Convert Max long as float back to long " + l);

        l = lMax;
        long maxOut = 0;
        while (maxOut < 10 && l >= 0) {
            long lFloat;
            f = l;
            lFloat = (long) f;
            out.print("float " + f + " long " + l + " lFloat " + lFloat);
            if (l != lFloat) {
                out.print(" !=");
                maxOut++;
            }
            out.println();
            l--;
        }
    }
}
