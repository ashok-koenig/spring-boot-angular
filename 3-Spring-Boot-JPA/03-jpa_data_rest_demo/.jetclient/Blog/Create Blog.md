```toml
name = 'Create Blog'
method = 'POST'
url = 'http://localhost:8080/blogs'
sortWeight = 1000000
id = 'b0ccc433-a19f-4553-9717-b57bbc51e626'

[body]
type = 'JSON'
raw = '''
{
  title: "Second blog title",
  content: "Second blog content here..."
}'''
```
