# Lab 1 - JUnit Testing and Coverage

## 1. Mục tiêu

Bài thực hành xây dựng một chương trình Java có:

* Ít nhất một vòng lặp.
* Ít nhất một lệnh rẽ nhánh.
* Các ca kiểm thử bằng JUnit.
* Kiểm thử bao phủ tất cả các lệnh (Statement Coverage).
* Kiểm thử bao phủ các đường đi trong chương trình (Path Coverage).
* Quản lý mã nguồn và quá trình thực hiện bài bằng GitHub Issues và Git Commits.

## 2. Cấu trúc project

```text
Lab1/
├── .gitignore
├── README.md
├── pom.xml
│
└── src/
    ├── main/
    │   └── java/
    │       └── Calculator.java
    │
    └── test/
        └── java/
            ├── Test_issue1.java
            └── Test_issue2.java
```

## 3. Chương trình chính

File:

```text
src/main/java/Calculator.java
```

Phương thức `sumEvenNumbers(int n)` dùng để tính tổng các số chẵn từ 1 đến `n`.

Trong phương thức có:

* Vòng lặp `for` để duyệt các số từ 1 đến `n`.
* Lệnh rẽ nhánh `if` để kiểm tra số hiện tại có phải số chẵn hay không.

Ví dụ:

```text
sumEvenNumbers(5) = 2 + 4 = 6
```

## 4. Issue #1 - Statement Coverage

### Mục tiêu

Viết các ca kiểm thử JUnit để bao phủ tất cả các lệnh thực thi trong chương trình.

File kiểm thử:

```text
src/test/java/Test_issue1.java
```

Ca kiểm thử được thiết kế để các câu lệnh trong phương thức `sumEvenNumbers()` được thực hiện ít nhất một lần.

Kết quả mong đợi:

* Các câu lệnh được thực thi.
* Test JUnit PASS.

## 5. Issue #2 - Path Coverage

### Mục tiêu

Viết các ca kiểm thử JUnit để bao phủ các đường đi khác nhau trong chương trình.

File kiểm thử:

```text
src/test/java/Test_issue2.java
```

Các trường hợp kiểm thử bao gồm:

* Vòng lặp không được thực hiện.
* Điều kiện `if` có giá trị `false`.
* Điều kiện `if` có giá trị `true`.
* Vòng lặp thực hiện nhiều lần.

Kết quả mong đợi:

* Các đường đi cần kiểm thử được thực hiện.
* Tất cả các test JUnit đều PASS.

## 6. Công nghệ sử dụng

* Java
* JUnit 5
* Maven
* Git
* GitHub

## 7. Chạy chương trình kiểm thử

Sử dụng Maven:

```bash
mvn test
```

Nếu tất cả các ca kiểm thử thành công, Maven sẽ hiển thị:

```text
BUILD SUCCESS
```

## 8. GitHub Issues và Commits

### Commit 1

Xây dựng chương trình Java ban đầu:

```text
Implement calculator program
```

### Issue #1

```text
Viết các ca kiểm thử JUnit để bao phủ tất cả các lệnh của chương trình.
```

Sau khi hoàn thành Issue #1:

```text
Add JUnit tests for statement coverage
```

### Issue #2

```text
Viết các ca kiểm thử JUnit để bao phủ tất cả các đường đi trong chương trình.
```

Sau khi hoàn thành Issue #2:

```text
Add JUnit tests for path coverage
```

## 9. Kết quả

Project hoàn thành khi:

* Chương trình Java chạy đúng.
* Các ca kiểm thử JUnit đều PASS.
* Issue #1 được giải quyết và đóng.
* Issue #2 được giải quyết và đóng.
* Các commit tương ứng được lưu trên GitHub.
