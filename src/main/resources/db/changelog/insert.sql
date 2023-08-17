INSERT INTO product (name, barcode, quantity)
VALUES ('Coca-Cola Zero', '5449000131836', -5),
       ('Gusto Pufuleti 85 g', '5941868200759', -2),
       ('WATER BORSEC 1.5', '5942219000059', 30),
       ('ROM KIKS MED KAKAO OG ROM SMAG 36G', '5941047827128', -100)
ON CONFLICT (barcode) DO NOTHING;
