```toml
name = 'Update blog'
method = 'PUT'
url = 'http://localhost:8080/blogs/2'
sortWeight = 4000000
id = 'f85fd1b2-3e45-4691-9320-f262b42f6255'

[body]
type = 'JSON'
raw = '''
{
  title: "Second blog title updated",
  content: "Second blog content updated"
}'''
```
