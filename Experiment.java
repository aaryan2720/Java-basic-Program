interface Sports {
    float SPORTS_MARKS = 10.0f;

    float getSportsMarks();
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    int getRollNo() {
        return rollNo;
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

class Test extends Student {
    float test1;
    float test2;

    Test(int rollNo, String name, float test1, float test2) {
        super(rollNo, name);
        this.test1 = test1;
        this.test2 = test2;
    }

    float getTest1() {
        return test1;
    }

    void setTest1(float test1) {
        this.test1 = test1;
    }

    float getTest2() {
        return test2;
    }

    void setTest2(float test2) {
        this.test2 = test2;
    }
}

class Result extends Test implements Sports {
    Result(int rollNo, String name, float test1, float test2) {
        super(rollNo, name, test1, test2);
    }

    @Override
    public float getSportsMarks() {
        return SPORTS_MARKS;
    }

    float calculateFinalResult() {
        return getTest1() + getTest2() + getSportsMarks();
    }
}


class Execution {
    public static void main(String[] args) {
        Result studentResult = new Result(42, "Aaryan", 80.00f, 90.0f);
        System.out.println("Roll No: " + studentResult.getRollNo());
        System.out.println("Name: " + studentResult.getName());
        System.out.println("Test 1 Marks: " + studentResult.getTest1());
        System.out.println("Test 2 Marks: " + studentResult.getTest2());
        System.out.println("Sports Marks: " + studentResult.getSportsMarks());
        System.out.println("Final Result: " + studentResult.calculateFinalResult());
    }
}
