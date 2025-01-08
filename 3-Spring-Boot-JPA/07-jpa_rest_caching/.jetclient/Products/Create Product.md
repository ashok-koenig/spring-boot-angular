```toml
name = 'Create Product'
method = 'POST'
url = 'http://localhost:8080/products'
sortWeight = 1000000
id = 'c34dd749-b613-4977-a0de-65fae004a5f6'

[auth.basic]
username = 'user'
password = 'user123'

[body]
type = 'JSON'
raw = '''
{
  title: "iPhone 16",
  category: "Smartphone",
  price: 67676
}'''
```
