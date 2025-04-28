package creational

import "strings"
type NotificationI interface{
	Send()
}

type SMS struct{
PhoneNumber string
Message string
}

func(sms *SMS) Send(){

}

type Email struct{
	Subject string
	Email string
	Body string
}

func(email *Email) Send(){}



func NotificationFactory(notificationType string,payload map[string]string) NotificationI{
	switch strings.ToLower(notificationType){
	case "sms":
		return &SMS{PhoneNumber: payload["phoneNumber"],Message: payload["message"]}
	
	case "email":
	    return &Email{Email: payload["email"],Subject: payload["subject"],Body: payload["dody"]}

	default:
		panic("Invalid Notification type")

	}
} 

/*
used to create an object that can be of several types, with out revealing how they are create you have an interface that implements a common base for all the types
then concrete implementations of the interface by the types 
then the factory that does the initialization based on the type requested for
*/