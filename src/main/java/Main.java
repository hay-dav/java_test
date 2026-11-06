public class Main {

    public static void main(String[] args) {

        TaskManager tm = new TaskManager();

        AnnotationProcessor annotationProcessor = new AnnotationProcessor();

        annotationProcessor.process(tm);

    }
}