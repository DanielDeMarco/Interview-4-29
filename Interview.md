# Challenge 1

Given an array `arr[]` and a position in array, k. Write a function name reverse `(a[], k)` such that it reverses subarray `arr[0..k-1]`

# Example

### Input:

```java
arr[] = [1, 2, 3, 4, 5, 6]
k = 4

reverseToK(k, arr) // [4, 3, 2, 1, 5, 6]
```

---

# Challenge 2

You are looking to make a website that shows all of the skills people at your company have so that they can be found when other have questions. You find a API that returns some data from company profiles
but the data contains alot of duplication. You need to format this JSON data to make it easy and efficient to search for
peoples skills given their email address.

## Resources

[json-simple Examples](https://www.mkyong.com/java/json-simple-example-read-and-write-json/)

### API Response

```json
{
  "data": [
    {
      "email": "etweddell0@timesonline.co.uk",
      "skills": ["node", "react", "java", "kubernetes"]
    },
    {
      "email": "kgrinin1@army.mil",
      "skills": ["java", "cloudfoundry", "git", "github"]
    },
    {
      "email": "rromaine2@reference.com",
      "skills": ["php", "html", "node"]
    },
    {
      "email": "gruller3@php.net",
      "skills": ["php", "mysql", "databases"]
    },
    {
      "email": "dcorradini4@prweb.com",
      "skills": ["docker", "sass", "css"]
    },
    {
      "email": "etweddell0@timesonline.co.uk",
      "skills": ["node", "react", "databases"]
    },
    {
      "email": "kgrinin1@army.mil",
      "skills": ["scm", "git", "github"]
    },
    {
      "email": "rromaine2@reference.com",
      "skills": ["kubernetes", "css", "html"]
    },
    {
      "email": "gruller3@php.net",
      "skills": ["angular", "mongodb"]
    },
    {
      "email": "dcorradini4@prweb.com",
      "skills": ["cloudfoundry", "containerd", "webpack"]
    }
  ]
}
```

## Desired Output

```json
{
  "etweddell0@timesonline.co.uk": [
    "node",
    "react",
    "java",
    "kubernetes",
    "databases"
  ],
  "kgrinin1@army.mil": ["java", "cloudfoundry", "git", "github", "scm"],
  "rromaine2@reference.com": ["php", "html", "node", "kubernetes", "css"],
  "gruller3@php.net": ["php", "mysql", "databases", "angular", "mongodb"],
  "dcorradini4@prweb.com": [
    "docker",
    "sass",
    "css",
    "cloudfoundry",
    "containerd",
    "webpack"
  ]
}
```

### API Raw Response
```
"{\"data\":[{\"email\":\"etweddell0@timesonline.co.uk\",\"skills\":[\"node\",\"react\",\"java\",\"kubernetes\"]},{\"email\":\"kgrinin1@army.mil\",\"skills\":[\"java\",\"cloudfoundry\",\"git\",\"github\"]},{\"email\":\"rromaine2@reference.com\",\"skills\":[\"php\",\"html\",\"node\"]},{\"email\":\"gruller3@php.net\",\"skills\":[\"php\",\"mysql\",\"databases\"]},{\"email\":\"dcorradini4@prweb.com\",\"skills\":[\"docker\",\"sass\",\"css\"]},{\"email\":\"etweddell0@timesonline.co.uk\",\"skills\":[\"node\",\"react\",\"databases\"]},{\"email\":\"kgrinin1@army.mil\",\"skills\":[\"scm\",\"git\",\"github\"]},{\"email\":\"rromaine2@reference.com\",\"skills\":[\"kubernetes\",\"css\",\"html\"]},{\"email\":\"gruller3@php.net\",\"skills\":[\"angular\",\"mongodb\"]},{\"email\":\"dcorradini4@prweb.com\",\"skills\":[\"cloudfoundry\",\"containerd\",\"webpack\"]}]}"
```

### Solutions Raw
```
"{\"etweddell0@timesonline.co.uk\":[\"node\",\"react\",\"java\",\"kubernetes\",\"databases\"],\"kgrinin1@army.mil\":[\"java\",\"cloudfoundry\",\"git\",\"github\",\"scm\"],\"rromaine2@reference.com\":[\"php\",\"html\",\"node\",\"kubernetes\",\"css\"],\"gruller3@php.net\":[\"php\",\"mysql\",\"databases\",\"angular\",\"mongodb\"],\"dcorradini4@prweb.com\":[\"docker\",\"sass\",\"css\",\"cloudfoundry\",\"containerd\",\"webpack\"]}"
```
