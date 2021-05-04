package racing.io;

public enum ConsoleMessage {

    REQUEST_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    REQUEST_REPEAT("시도할 횟수는 몇번인가요"),
    RACING_RESULT("실행 결과"),
    RACING_WINNERS("가 최종우승했습니다."),
    SCORE_SEPARATOR(":"),
    RACING_DISTANCE("-"),
    REQUEST_ERROR("잘못된 입력입니다. 다시 한번 확인해 주세요.");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

}
