package main

import "design-patterns/behavioural"
func main(){

	channel:= &behavioural.TutorialChannel{}

	channel.Register(&behavioural.EmailSubscriber{Email: "beejayphil@gmail.com"})
	channel.Register(&behavioural.EmailSubscriber{Email: "kenzy@gmail.com"})
	channel.Notify(map[string]string{
		"tutorial": "learning goroutines",
	})
}

