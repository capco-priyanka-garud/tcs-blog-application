# Spring Boot, H2, JPA, Rest API

Build Restful CRUD API for a blog using Spring Boot, Mysql, JPA and Hibernate.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/capco-priyanka-garud/tcs-blog-application.git
```

**2. H2 in memory database is created by application. Schema defination ad data values are defined in schema.sql and data.sql file
Access Details:
	url     : http://localhost:8080/h2-console/login.jsp?jsessionid=2ca1807f39aee9a5693a44d9bd8e41a5
	JDBC URL: jdbc:h2:mem:~/blogdb
	User Name:	sa


**4. Run the app using graddle bootRun task**

```
The app will start running at <http://localhost:8080>

## Explore Rest APIs

The app defines following CRUD APIs.


### Users

| Method | Url | Description | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | /api/users/details | Used to get all users personal details with post created by each user
### Posts

| Method | Url | Description | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| POST   | /api/posts | Create new post by admin | [JSON](#postcreate) |


Test them using postman or any other rest client.

## Sample Valid JSON Request Bodys

##### <a id="getAllDetails">GET ALL User Details -> /api/user/details</a>
```json
[
    {
        "userPersonalInfo": {
            "id": 1,
            "firstName": "Leanne",
            "lastName": "Graham",
            "username": "bret",
            "email": "Sincere@april.biz",
            "address": {
                "street": "Kulas Light",
                "suite": "Apt. 556",
                "city": "Gwenborough",
                "zipcode": "92998-3874",
                "geo": {
                    "lat": "37.3159",
                    "lng": "81.1496"
                }
            },
            "phone": "1-770-736-8031 x56442",
            "website": "hildegard.org",
            "company": {
                "name": "Romaguera-Crona",
                "catchPhrase": "Multi-layered client-server neural-net",
                "bs": "harness real-time e-markets"
            }
        },
        "userAllPostInfo": [
            {
                "id": 1,
                "title": "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum",
                "body": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"
            },
            {
                "id": 3,
                "title": "Priyanka",
                "body": "first post"
            }
        ]
    },
    {
        "userPersonalInfo": {
            "id": 2,
            "firstName": "Ervin",
            "lastName": "Howell",
            "username": "Antonette",
            "email": "Shanna@melissa.tv",
            "address": {
                "street": "Victor Plains",
                "suite": "Suite 879",
                "city": "Wisokyburgh",
                "zipcode": "90566-7771",
                "geo": {
                    "lat": "-43.9509",
                    "lng": "-34.4618"
                }
            },
            "phone": "010-692-6593 x09125",
            "website": "anastasia.net",
            "company": {
                "name": "Deckow-Crist",
                "catchPhrase": "Proactive didactic contingency",
                "bs": "synergize scalable supply-chains"
            }
        },
        "userAllPostInfo": [
            {
                "id": 2,
                "title": "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\n",
                "body": "qui est esse"
            }
        ]
    }
]
```

##### <a id="postcreate">Create Post -> /api/posts</a>
```json
{
    "userId": 1,
    "title": "Priyanka",
    "body": "first post",
    "postCreatedBy": "admin"
}
