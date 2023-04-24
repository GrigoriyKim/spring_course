package AspectOrientedProgramming.AdviceAround.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: logiruem poluchenie spiska studentov" +
//                " pered metodom getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudents())"
//    ,returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logiruem poluchenie spiska studentov" +
//                " posle raboti metoda getStudents");
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: logiruem normalnoe okonchanie raboti" +
                " metoda ili vibros isklyucheniya");
    }
}
