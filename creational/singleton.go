package creational

import (
	"fmt"
	"sync"
)

var mx sync.Mutex
type Database interface{
	GetConnection() string
	CreateConnection(dataBaseUrl string)
}
type DBConnect struct{
connect string
}

type Postgres struct{
connection *DBConnect
}

func(p *Postgres) GetConnection()string{
return p.connection.connect
}

func(p *Postgres)CreateConnection(databaseUrl string){
	

	mx.Lock()
	if p.connection != nil{
		fmt.Println("Database already initialized")
		return
	}

   p.connection=&DBConnect{connect: databaseUrl}
	defer mx.Unlock()

	fmt.Println("new database url ",p.connection.connect)

}

func NewDBConnection()*Postgres {
return &Postgres{}
}