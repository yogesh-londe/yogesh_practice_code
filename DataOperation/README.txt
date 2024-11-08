CURL to get the data from both table at a time
Get Request:- 
curl --location 'http://localhost:9057/employee-student-data'

Post Request To add Employee:-
curl --location 'http://localhost:9057/employeeBatch' \
--header 'Content-Type: application/json' \
--data '[
    {
        "name": "John Doe",
        "position": "Developer"
    },
    {
        "name": "Jane Smith",
        "position": "Manager"
    },
    {
        "name": "donald Trump",
        "position": "President"
    },
    {
        "name": "Tom Cruise",
        "position": "Project lead"
    }
]'


Post REquest to add Student:- 
curl --location 'http://localhost:9057/studentBatch' \
--header 'Content-Type: application/json' \
--data '[
    {
        "name": "will smith",
        "major": "Computer Science"
    },
    {
        "name": "John Cena",
        "position": "Management"
    },
    {
        "name": "Elon Musk",
        "position": "Physics"
    },
    {
        "name": "John Carter",
        "position": "Medical"
    }
]'
