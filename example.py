import hashlib
from cryptography.hazmat.primitives.asymmetric import rsa, ec
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from Crypto.Cipher import DES, ARC4, Blowfish
import os

# 1. Legacy Hash (MD5)
hashlib.md5(b"password").hexdigest()

# 2. Legacy Hash (SHA-1)
hashlib.sha1(b"admin123").hexdigest()

# 3. Modern Hash (SHA-256)
hashlib.sha256(b"secure_data").hexdigest()

# 4. Asymmetric (RSA - Vulnerable to Shor's Algorithm)
rsa.generate_private_key(public_exponent=65537, key_size=2048)

# 5. Asymmetric (Elliptic Curve - Vulnerable to Shor's Algorithm)
ec.generate_private_key(ec.SECP256R1())

# 6. Symmetric (AES in ECB Mode - Weak)
Cipher(algorithms.AES(os.urandom(32)), modes.ECB())

# 7. Symmetric (AES in CBC Mode)
Cipher(algorithms.AES(os.urandom(32)), modes.CBC(os.urandom(16)))

# 8. Legacy Symmetric (DES)
DES.new(b'8bytekey', DES.MODE_ECB)

# 9. Legacy Stream Cipher (RC4)
ARC4.new(b'secretkey')

# 10. Legacy Symmetric (Blowfish)
Blowfish.new(b'blowfishkey', Blowfish.MODE_CBC, os.urandom(8))