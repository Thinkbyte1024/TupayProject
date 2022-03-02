# TupayProject
Project sederhana untuk menghubungkan database MySQL.
## Kebutuhan Aplikasi
Aplikasi ini memastikan Anda telah memiliki Aplikasi IDE untuk Java seperti IntelliJ IDEA atau Apache Netbeans untuk membuat dan men-compile aplikasi ini.
## Cara menjalankan database MySQL
Ada dua cara untuk menjalankan database MySQL ini.
### Docker Container
Pastikan Anda sudah memiliki aplikasi **Docker** di komputer Anda. Jika tidak silahkan dapatkan melalui tautan ini. https://docs.docker.com/get-docker/

#### MacOS / Linux / Unix lainnya
1. Pada aplikasi terminal, buka folder bernama "database" lalu "mysql-docker" menggunakan syntax berikut:
`cd <tempat-project-repo>/database/mysql-docker` ganti <tempat-project-repo> dengan tempat asal project ini.
2. Setelah itu eksekusi perintah berikut dalam directory tersebut pada terminal:
`docker compose up -d`

#### Windows
1. Pada aplikasi Command Prompt (cmd) atau PowerShell, buka folder bernama "database" lalu "mysql-docker" menggunakan syntax berikut:
`cd <tempat-project-repo>\database\mysql-docker` ganti <tempat-project-repo> dengan tempat asal project ini.
2. Setelah itu eksekusi perintah berikut dalam directory tersebut pada CMD atau PowerShell:
`docker compose up -d`

### Restore SQL script
Dalam pembuatan
