 p a c k a g e   h e l a b a s a . s e r v l e t s . u t i l s ;  
  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e s s i o n ;  
  
 p u b l i c   c l a s s   A d m i n L o g i n   {  
 	  
 	 p r i v a t e   s t a t i c   S t r i n g   H B _ A U T H _ C H E C K _ S T R   =   " H E L A B A S A _ A U T H E N T I C A T E D " ;  
 	 p r i v a t e   s t a t i c   S t r i n g   H B _ A U T H _ P A R A M   =   " H B _ A U T H _ P A R A M " ;  
 	  
 	 p u b l i c   A d m i n L o g i n ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   s t a t i c   b o o l e a n   V e r i f y ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	 	 t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
 	 {  
 	 	 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ;  
 	 	 S t r i n g   s A u t h P a r a m   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( H B _ A U T H _ P A R A M ) ;  
 	 	 / / o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ P A R A M ,   " I N V A L I D " ) ;  
 	 	 	 	  
 	 	 i f ( s A u t h P a r a m ! = n u l l   & &   s A u t h P a r a m . e q u a l s ( H B _ A U T H _ C H E C K _ S T R ) )  
 	 	 {  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 P r i n t L o g i n P a g e ( o R e q ,   o R e s ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	 	  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   v o i d   M a r k A u t h e n t i c a t e d ( H t t p S e r v l e t R e q u e s t   o R e q )  
 	 {  
 	 	 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ; 	 	  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ P A R A M ,   H B _ A U T H _ C H E C K _ S T R ) ;  
 	 	 / / o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ P A R A M ,   " I N V A L I D " ) ;  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   b o o l e a n   A u t h e n t i c a t e ( H t t p S e r v l e t R e q u e s t   o R e q ,   S t r i n g   s U s e r n a m e ,   S t r i n g   s P a s s w o r d )  
 	 {  
 	 	 i f ( s U s e r n a m e . e q u a l s ( " p r i y a n g a " )   & &   s P a s s w o r d . e q u a l s ( " m i t 1 2 3 " ) )  
 	 	 { 	 	  
 	 	 	 M a r k A u t h e n t i c a t e d ( o R e q ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 e l s e   i f ( s U s e r n a m e . e q u a l s ( " n i m a s h a " )   & &   s P a s s w o r d . e q u a l s ( " c s e 1 2 3 " ) )  
 	 	 { 	 	  
 	 	 	 M a r k A u t h e n t i c a t e d ( o R e q ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }    
 	 	 e l s e   i f ( s U s e r n a m e . e q u a l s ( " s u r a n g i k a " )   & &   s P a s s w o r d . e q u a l s ( " c s e 1 2 3 " ) )  
 	 	 { 	 	  
 	 	 	 M a r k A u t h e n t i c a t e d ( o R e q ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }    
 	 	 e l s e   i f ( s U s e r n a m e . e q u a l s ( " g i h a n " )   & &   s P a s s w o r d . e q u a l s ( " c s e 1 2 3 " ) )  
 	 	 { 	 	  
 	 	 	 M a r k A u t h e n t i c a t e d ( o R e q ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }    
 	 	 e l s e  
 	 	 {  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	 }  
 	  
         p r i v a t e   s t a t i c   v o i d   P r i n t L o g i n P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )   t h r o w s   I O E x c e p t i o n  
         {  
         	 S t r i n g   s U s e r n a m e   =   o R e q . g e t P a r a m e t e r ( " t u s e r n a m e " ) ;  
         	 S t r i n g   s P a s s w o r d   =   o R e q . g e t P a r a m e t e r ( " t p a s s w o r d " ) ;  
         	 i n t   b A u t h S t a t u s   =   0 ;  
         	  
         	 i f ( s U s e r n a m e ! = n u l l   & &   s U s e r n a m e ! = " "   & &   s P a s s w o r d ! = n u l l   & &   s P a s s w o r d ! = " " )  
         	 {  
         	 	 i f ( A u t h e n t i c a t e ( o R e q ,   s U s e r n a m e ,   s P a s s w o r d ) )  
         	 	 {  
         	 	 	 b A u t h S t a t u s   =   1 ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 b A u t h S t a t u s   =   - 1 ;  
         	 	 }  
         	 }  
         	  
         	 i f ( b A u t h S t a t u s   = =   1 )  
         	 {  
         	 	 o R e s . s e n d R e d i r e c t ( " a d m i n _ p a g e " ) ;  
         	 	 / / P r i n t A d m i n P a g e ( o R e s ) ;  
         	 }  
         	 e l s e  
         	 {  
 	         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
 	         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 1 6 b e " ) ;  
 	                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
 	                  
 	                 H e l a b a s a . S e t L o g ( o u t ) ;  
 	                  
 	                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   M e n u < / t i t l e > < / h e a d > " ) ;  
 	                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > " ) ;  
 	                 o u t . p r i n t l n ( " a   { t e x t - d e c o r a t i o n : n o n e ; } " ) ;  
 	                 o u t . p r i n t l n ( " a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } " ) ;  
 	                 o u t . p r i n t l n ( " < / s t y l e > " ) ;  
 	                 o u t . p r i n t l n ( " < b o d y   a l i g h = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
 	                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / h 3 > " ) ;  
 	                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > L o g i n   P a g e < / h 3 > " ) ;  
 	  
 	                 i f ( b A u t h S t a t u s = = - 1 )  
 	                 {  
 	                 	 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > I n v a l i d   u s e r n a m e - p a s s w o r d   p a i r !   P l e a s e   r e t r y ! < / h 3 > " ) ; 	  
 	                 }  
 	                  
 	                 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ;  
 	 	 	 S t r i n g   s A u t h P a r a m   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( H B _ A U T H _ P A R A M ) ;  
 	                  
 	 	 	 o u t . p r i n t l n ( " < h 1 > A U T H = "   +   s A u t h P a r a m   +   " < / h 1 > " ) ;  
 	                  
 	                 o u t . p r i n t l n ( " < f o r m   i d = ' f a d m i n '   a c t i o n = . / a d m i n _ p a g e   a l i g n = ' c e n t e r '   m e t h o d = ' p o s t ' > " ) ;  
 	                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > " ) ;  
 	                 o u t . p r i n t l n ( " < t a b l e   a l i g n = ' c e n t e r '     s t y l e = ' f o n t - f a m i l y : a r i a l ;   f o n t - s i z e : 0 . 8 e m ; ' > " ) ;  
 	                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > U s e r n a m e < / b > < / t d > < t d > < i n p u t   t y p e = ' t e x t '   i d = ' t u s e r n a m e '   n a m e = ' t u s e r n a m e ' > < / t d > < / t r > " ) ;  
 	                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > P a s s w o r d < / b > < / t d > < t d > < i n p u t   t y p e = ' p a s s w o r d '   i d = ' t p a s s w o r d '   n a m e = ' t p a s s w o r d ' > < / t d > < / t r > " ) ;  
 	                  
 	                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < / t d > < t d > < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' L o g i n '   s t y l e = ' h e i g h t :   2 e m ;   w i d t h :   4 e m ' > < / t d > < / t r > " ) ;                  
 	                 o u t . p r i n t l n ( " < / t a b l e > " ) ;  
 	                 o u t . p r i n t l n ( " < / p > < / f o r m > " ) ;  
 	  
 	                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' >   r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
 	                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;  
         	 }  
         } 	  
 }  
