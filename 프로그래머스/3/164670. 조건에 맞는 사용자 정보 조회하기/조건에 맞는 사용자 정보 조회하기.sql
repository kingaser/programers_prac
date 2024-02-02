-- 코드를 입력하세요
SELECT U.USER_ID, U.NICKNAME, 
CONCAT(U.CITY, ' ', U.STREET_ADDRESS1, ' ', U.STREET_ADDRESS2) 
전체주소,
CONCAT(SUBSTRING(TLNO, 1, 3), '-', SUBSTRING(TLNO,4, 4), '-', SUBSTRING(TLNO, 8)) 전화번호
FROM USED_GOODS_BOARD B
JOIN USED_GOODS_USER U
    ON B.WRITER_ID = U.USER_ID
GROUP BY WRITER_ID
HAVING COUNT(*) >= 3
ORDER BY USER_ID DESC
