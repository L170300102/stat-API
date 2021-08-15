# MyMovie API

개정이력 

| Version | Date of change | Reason for change | Change history |
|---------|----------------|-------------------|----------------|
| 1.0     | 2021-08-11     | First create      | First create   |
| -        |                |                   |                |
| -        |                |                   |                |

## API (Application programming interface)

운영체제나 시스템, 애플리케이션, 라이브러리 등을 활용해 응용 프로그램을 작성할 수 있게 하는 다양한 인터페이스를 의미한다. Window API, Java API, HTML5 API, Android API 등이 있다.

## 영화 정보

### 등록 내역 조회 API

MyMovie로 등록된 영화의 정보를 조회한다.

#### 요청url

[https://mymovieexample.net/api/proxy/39b8d232dbb011e79252394919cf6a6f/{your_appkey}?{params(key=value)}](https://mymovieexample.net/api/proxy/39b8d232dbb011e79252394919cf6a6f/{your_appkey}?{params(key=value)})

#### Request Parameters

| Name            | Type    | Description | Mandatory | Note |
|-----------------|---------|-------------|-----------|------|
| returnCode      | string  | 결과 코드            | o      | 결과 코드 <br /> - 00: 성공 <br /> - 01: 등록내역 없음 <br /> - 02: 내부오류   |
| transactionId   | number  | 영화 등록 고유번호(19자리)            | o          |      |
| transactionDate | string  | 개봉 일시(ISO 8601)            | o          |      |
| amount          | decimal | 관객 수            | x          |      |
| productName | string | 영화 제목 | o | |