# Java Works 2024
- Java Programming 복습
- 2024.07.03

## git repository 생성하기
- 원격(http://github.com/jinh0318a/Biz-2024-501-Java) repository 만들기
- 로컬폴더를 로컬 repository로 생성하기
```bash
git init
```
- 원격 repository와 로컬 repository 연결하기
```bash
git remote add origin https://github.com/jinh0318a/Biz-2024-501-Java.git
```
- 로컬 폴더의 파일과 폴더를 로컬 repository에 압축하여 저장하기
```bash
git add README.md
git add .
```
- 압축된 로컬 repository에 comment 붙이기
```bash
git commit -m "처음으로 업로드 하기"
```
- 로컬 repository를 원격 repository에 업로드 하기
```bash
git push -u origin
```