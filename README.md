# java-calculator-precourse

## 구현할 기능 목록

### 입력
- `Console.readLine()`으로 입력 받기

### 기본 구분자 처리
- 빈 문자열/`null` → 0 반환
- `,` `:` 구분자로 숫자 분리 후 합산

### 커스텀 구분자 처리
- `//`와 `\n` 사이 문자를 커스텀 구분자로 인식
- 커스텀 구분자로 숫자 분리 후 합산

### 예외 처리
- 음수 → `IllegalArgumentException`
- 숫자 아닌 값 → `IllegalArgumentException`

### 출력
- `"결과 : {숫자}"` 형식 출력
