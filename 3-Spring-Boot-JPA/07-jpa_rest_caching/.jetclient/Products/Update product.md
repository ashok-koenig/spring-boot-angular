```toml
name = 'Update product'
method = 'PUT'
url = 'http://localhost:8080/products/11'
sortWeight = 4000000
id = 'b7a4e136-1153-4df5-84a9-3b62ae8dbc96'

[auth.basic]
username = 'user'
password = 'user123'

[body]
type = 'JSON'
raw = '''
{
  title: "iPhone 14",
  category: "Smartphone",
  price: 56565
}'''
```
