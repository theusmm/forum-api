INSERT INTO usuario (nome, email, password) VALUES ('admin', 'admin@email.com', '$2a$12$dy25wM92prjEJjfgyF9RGuXs7q/ppaVuOA9rRmfMtcck56KcHiXii');
INSERT INTO role (nome) VALUES ('ADMIN');
INSERT INTO usuario_role (usuario_id, role_id) VALUES (2, 2);