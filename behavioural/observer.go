package behavioural

import "fmt"

type Observer interface{
	Update(data any)
}

type Subject interface{
	Register(observer Observer)
	Unregister(observer Observer)
	Notify(data any)
}


type TutorialChannel struct{
	observers []Observer
}

func (t *TutorialChannel) Register(observer Observer){
	t.observers = append(t.observers, observer)
}

func (t *TutorialChannel) Unregister(observer Observer){
	for i, obs := range t.observers{
		if obs == observer{
			t.observers = append(t.observers[:i], t.observers[i+1:]...)
			break
		}
	}
}

func (t *TutorialChannel) Notify(data any){
	for _, obs := range t.observers{
		obs.Update(data)
	}
}

type EmailSubscriber struct{
	Email string
}

func (e *EmailSubscriber) Update(data any){
fmt.Println("Email to ",e.Email,":",data)

}		



/*
useful when we have a list of dependents on an object and they need to be notified automatically when theres a state change in the object kind of like in a pub/sub system


*/