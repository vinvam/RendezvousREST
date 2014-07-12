RendezvousREST
==============

A REST API for a cross platform mobile application

Here's some basic usage.  

First, let's create a user called "user1"
`curl --header 'Content-Type: application/json' -d '{"id":"user1"}' https://rendezvousrestv1.appspot.com/_ah/api/userendpoint/v1/user`

Let's list all the users and we should see "user1"
`curl https://rendezvousrestv1.appspot.com/_ah/api/userendpoint/v1/user`

Let's get all the information about "user1"
`curl https://rendezvousrestv1.appspot.com/_ah/api/userendpoint/v1/user/user1`

Now let's delete "user1":
`curl --request DELETE https://rendezvousrestv1.appspot.com/_ah/api/userendpoint/v1/user/user1`


Events work very similarly.

Let's use "user1" to create a "bday" event
`curl --header 'Content-Type: application/json' -d '{"eventId":"bday","creator":"user1"}' https://rendezvousrestv1.appspot.com/_ah/api/eventendpoint/v1/event`

Let's list all the events:
`curl https://rendezvousrestv1.appspot.com/_ah/api/eventendpoint/v1/event`

Let's add modify some information about "bday".  Let's add a title "Birthday Party" and invite "user2"
`curl --request PUT --header 'Content-Type: application/json' -d '{"eventId":"bday","title":"Birthday Party", "invitedUsers":["user2"]}' https://rendezvousrestv1.appspot.com/_ah/api/eventendpoint/v1/event`

Now let's fetch the infomation about "bday"
`curl https://rendezvousrestv1.appspot.com/_ah/api/eventendpoint/v1/event/bday`

The birthday is over so let's delete "bday"
`curl --request DELETE https://rendezvousrestv1.appspot.com/_ah/api/eventendpoint/v1/event/bday`
