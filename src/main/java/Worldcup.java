public class Worldcup {

    /**
     * 월드컵이 연린 년도인지 측정하는 메소드
     * @param year 확인용 년도
     * @return 4년주기가 기준이지 맞는지 boolean값
     * @throws IllegalArgumentException 부적잘한 인수를 메소드를 넘겨받을때 발생함
     * @since 2022
     */
    public boolean isWorldcupYear(int year) throws IllegalArgumentException {
        if (year < 1930) {
            return false;
        }
        if (year == 1966 || year == 1978 || year == 1994 || year == 2018) {
            return false;
        }
        if (year == 2022) {
            return true;
        }
        if (2030 < year) {
            throw new IllegalArgumentException(
                    "2030년까지만 지원합니다. 입력년도: " + year);
        }
        return year % 4 == 0;
    }
}