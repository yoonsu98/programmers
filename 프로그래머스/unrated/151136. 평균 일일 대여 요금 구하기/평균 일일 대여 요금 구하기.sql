-- 코드를 입력하세요
SELECT
    CAST(SUM(DAILY_FEE) OVER() / COUNT(1) OVER() AS DECIMAL(10,0)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR 
WHERE 1=1
AND CAR_TYPE = 'SUV'
LIMIT 1