Proxy Design Pattern:
Used for post-processing and pre-processing of request/responses

User requesting from EmployeeDao, but actually it's calling to its proxy,
then this proxy is calling to actally Impl.