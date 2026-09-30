# Hotel Management System

Product Types:
- Room
- BookingService
- GuestService

Product Families:
- Economy
- Business
- Luxury
- Resort

Factory Method:
BookingCreator creates BookingService implementations.

Abstract Factory:
HotelFactory creates a compatible family of:
Room + BookingService + GuestService.

Runtime Selection:
HotelFactoryProvider selects the factory based on hotel type.

New Family Extension:
Added:
- ResortRoom
- ResortBookingService
- ResortGuestService
- ResortHotelFactory

Modified:
- HotelFactoryProvider

HotelManagementSystem required no modification.