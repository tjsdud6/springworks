-- 비즈니스 컴포넌트(BoardWeb) board 테이블
CREATE TABLE board(
    bno         NUMBER(5) PRIMARY KEY,
    title       VARCHAR2(200),
    writer      VARCHAR2(20),
    content     VARCHAR2(2000),
    regdate     DATE DEFAULT SYSDATE,
    cnt         NUMBER(5) DEFAULT 0
);

--자동 번호
CREATE SEQUENCE seq;

--게시글 추가(더미데이터 넣기)
INSERT INTO board(bno, title, writer, content)
VALUES(seq.NEXTVAL, '가입인사', '관리자', '잘 부탁드립니다...');


--users 테이블생성
CREATE TABLE users(
    id          VARCHAR2(8) PRIMARY KEY,
    passwd      VARCHAR2(8) NOT NULL,
    name        VARCHAR2(20) NOT NULL,
    role        VARCHAR2(5)
);

--회원 추가 (role - 관리자를 뜻함)
INSERT INTO users(id, passwd, name, role)
VALUES('test', 'test123', '관리자', 'Admin');
INSERT INTO users(id, passwd, name, role)
VALUES('user1', 'user123', '장그래', 'User');

COMMIT;
SELECT * FROM board;
SELECT * FROM users;
