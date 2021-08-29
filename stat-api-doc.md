# Stat API

개정이력 

| Version | Date of change | Reason for change | Change history |
|---------|----------------|-------------------|----------------|
| 1.0     | 2021-08-11     | First create      | First create   |
| 1.1        | 2021-08-26               | 접속자수에 관한 API로 맞게 수정, 구현부분 추가                  | 각 기준별 접속자수 추가               |
| 1.2        | 2021-08-29               | 접속자수 API 관련 내용 추가 수정                  | 추가 밎 수정               |

## API (Application programming interface)

운영체제나 시스템, 애플리케이션, 라이브러리 등을 활용해 응용 프로그램을 작성할 수 있게 하는 다양한 인터페이스를 의미한다. Window API, Java API, HTML5 API, Android API 등이 있다.

---

## 영화 정보(예시)

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

---

## 연도별 접속자 수

### 요청 URI

> api/logs/year/{year}

### Request Parameters

| Name            | Type    | Description | Mandatory | Note |
|-----------------|---------|-------------|-----------|------|
| RequestName      | string  | logs            | o      |    |
| year   | string  | YY            | o          |      |

#### 예시

```javascript
{
    "totCnt": 25,
    "year": "20",
    "requestCode": "L",
    "is_success": true
}
```

## 월별 접속자 수

### 요청 URI

> api/logs/yearMonth/{YYMM}

### Request Parameters

| Name            | Type    | Description | Mandatory | Note |
|-----------------|---------|-------------|-----------|------|
| RequestName      | string  | logs            | o      |    |
| yearMonth   | string  | YYMM            | o          |      |

#### 예시

```javascript
{
    "totCnt": 25,
    "yearMonth": "2007",
    "requestCode": "L",
    "is_success": true
}
```

## 부서별 접속자 수

### 요청 URI

> api/logs/yearMonth/{YYMM}/{dept}

### Request Parameters

| Name            | Type    | Description | Mandatory | Note |
|-----------------|---------|-------------|-----------|------|
| RequestName      | string  | logs            | o      |    |
| yearMonth   | string  | YY            | o          |      |
| department | string | dept | o | |

#### 예시

```javascript
{
    "totCnt": 25,
    "yearMonth": "200703",
    "requestCode": "L",
    "dept": "DB"
    "is_success": true
}
```

## 일별 접속자 수

### 요청 URI

> api/logs/date/{YYMMDD}

### Request Parameters

| Name            | Type    | Description | Mandatory | Note |
|-----------------|---------|-------------|-----------|------|
| RequestName      | string  | logs            | o      |    |
| year   | string  | YY            | o          |      |
| month | string | MM | o | |
| day | string | DD | o | |

#### 예시

```javascript
{
    "date": "200818",
    "totCnt": 25,
    "requestCode": "L",
    "is_success": true
}
```

## 일평균 접속자 수

### 요청 URI

> api/logs/yearMonth/avg/{YYMM}

### Request Parameters

| Name            | Type    | Description | Mandatory | Note |
|-----------------|---------|-------------|-----------|------|
| RequestName      | string  | logs            | o      |    |
| year   | string  | YY            | o          |      |
| month | string | MM | o | |
| avgDate | string | YYMMDD | o | |

#### 예시

```javascript
{
    "avgDate": "0.03"
    "yearMonth": "200818",
    "requestCode": "L",
    "is_success": true
}
```

## 공휴일을 제외한 월 접속자 수

### 요청 URI

> api/logs/nonph/{year}

### Request Parameters

| Name            | Type    | Description | Mandatory | Note |
|-----------------|---------|-------------|-----------|------|
| RequestName      | string  | logs            | o      |    |
| year   | string  | YY            | o          |      |

#### 예시

```javascript
{
    "totCnt": 25,
    "yearMonth": "200703",
    "requestCode": "L",
    "is_success": true
}
```