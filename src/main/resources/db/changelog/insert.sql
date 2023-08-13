INSERT INTO product (name, barcode)
VALUES ('Coca-Cola Zero', ean13_in('5449000131836')),
       ('Gusto Pufuleti 85 g', ean13_in('5941868200759')),
       ('WATER BORSEC 1.5', ean13_in('5942219000059')),
       ('ROM KIKS MED KAKAO OG ROM SMAG 36G', ean13_in('5941047827128'))
ON CONFLICT (barcode) DO NOTHING;
