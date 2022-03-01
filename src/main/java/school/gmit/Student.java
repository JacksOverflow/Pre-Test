package school.gmit;

public class Student {
    String studentName;
    String studentEmail;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        if(checkForNumbers(studentName)){
            throw new IllegalArgumentException("Numbers exist in name...");
        } else {
            this.studentName = studentName;
        }

    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public boolean checkForNumbers(String name){
        boolean flag = false;
        char[] ch = name.toCharArray();
        for (int i = 0; i < name.length(); ++i){
            if(Character.isDigit(ch[i])){
                flag = true;
            }
        }
        return flag;
    }


}
