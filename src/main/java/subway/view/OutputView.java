package subway.view;

public class OutputView {
    private static final String INFO = "[INFO]";
    private static final String ERROR = "[ERROR]";

    private static void info(String msg) {
        System.out.println(INFO + msg);
    }

    private static void error(String msg) {
        System.out.println(ERROR + msg);
    }

    public static void printMainMenu() {
        System.out.println("## 메인 화면\n"
                + "1. 경로 조회\n"
                + "Q. 종료\n"
                + "\n"
                + "## 원하는 기능을 선택하세요.");
    }

    public static void printRouteMenu() {
        System.out.println("## 경로 기준\n"
                + "1. 최단 거리\n"
                + "2. 최소 시간\n"
                + "B. 돌아가기\n"
                + "\n"
                + "## 원하는 기능을 선택하세요.");
    }

    public static void printInputStationStart() {
        System.out.println("## 출발역을 입력하세요.");
    }

    public static void printInputStationEnd() {
        System.out.println("## 도착역을 입력하세요.");
    }

    public static void printResult() {
        info("---");
        info("총 거리 : km");
        info("총 소요 시간: 분");
        info("---");
        info("교대역");
        info("강남역");
        info("양재역");
    }

    public static void printError(String e) {
        error(e);
    }
}