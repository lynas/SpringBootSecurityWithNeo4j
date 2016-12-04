# SpringBootSecurityWithNeo4j

Spring boot project with spring security authentication server ins neo4j


Run this insert statement first

CREATE 
  (:AppUser{ 
    username : 'admin', 
    password: '$2a$10$3mUSOw6gya8AeNnzL7qiaO2p9qeko.rWVpRpRdZQ4SoICglyGQVHa',
    authorities: 'ROLE_USER, ROLE_ADMIN'
  });
  
password is 123456
